//package Stacks;
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class NextGreaterElement {
//    public ArrayList<Integer> nextLargerElement(int[] arr) {
//        int n = arr.length;
//        int[] nge = new int[n];
//        nge[n-1] = -1;              //last element ka next greater kux nhi hota hai so -1.
//
//        Stack<Integer> st = new Stack<>();
//        st.push(arr[n-1]);
//
//        for(int i=n-2;i>=0;i--){        // Traverse from right to left
//            while(st.size()>0 && arr[i]>=st.peek()) st.pop();            // Remove elements which are smaller // or equal to current element        ==>> agar stack empty nhi hai and array element stack ke peek/top element se bada hai usse pop/nikalo and
//            if(st.size()==0) nge[i] = -1;                                // If stack is empty, no greater element exists        ==>> Agar stack empty hai means current element ka next greater nhi hai to -1 return karo
//            else nge[i] = st.peek();                                    //otherwise, stack ke peek hi next greater honge.
//            st.push(arr[i]);                                           // Push current element          ==>> stack me push kar do array element ko
//        }
//
//        //for only ArrayList
//        ArrayList<Integer> ans = new ArrayList<>(n);
//        for(int i=0;i<n;i++){
//            ans.add(nge[i]);
//        }
//        return ans;
//    }
//}


//Note: We can also use st.isEmpty() instead of st.size()>0 Both are same things

/* Solution Pattern:-

Right → Left
Pop smaller/equal
        ↓
Stack empty? → -1
        ↓
Otherwise → stack.peek()
        ↓
Push current


Approach: Monotonic Stack
Traversal: Right → Left
TC: O(n)
AS: O(n)
 */