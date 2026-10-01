package Stacks;
import java.util.Stack;

//public class BaseBallGame {
//    public int calPoints(String[] arr) {
//        int n = arr.length;
//        Stack<Integer> st = new Stack<>();
//
//        for(int i=0;i<n;i++){
//            String s = arr[i];
//
//            if(s.equals("C")) st.pop();                             //if String is equal to C then, Remove the previous score.
//            else if(s.equals("D")) st.push(2*st.peek());        //if String is equal to D then, Add 2 × previous score.
//            else if(s.equals("+")){             //if String is equal to plus(+) then,  Add the previous two scores.
//                int top = st.pop();             //Step1: stack ki last value ko nikal kar top variable me store kar denge.
//                int secondTop = st.peek();      //Step2: stack ki 2nd last value ko secondTop variable me store kar lenege.             //peek sirf value dekhta hai(or, value copy karta hai) remove nhi karta hai.
//                int sum = top + secondTop;      //Step3: Add
//                st.push(top);                   //Step4: stack ke under last value ko push kar denge.
//                st.push(sum);                   //Step5: then, stack ke under added value ko push kar denge
//            }
//            else st.push(Integer.parseInt(s));  //Integer.parseInt(s): It convert string to integer value like "5" to 5.    =>ye hame number nikalkar de dega.
//        }
//
//        //for adding all elements/variables
//        int sum = 0;
//        while(st.size()>0){         //Jabtak stack empty nhi ho jata hai tabtak loop chalate raho.
//            sum += st.pop();        //stack me se eke ek elements ko nikalo and sum ke under add karte raho jabtak stack empty na ho jata hai tabtak ayesa karo, isse stack me se savi elements nikal jayenge and add v ho jayege.
//        }
//        return sum;
//    }
//}


/* Explanations:-
C = Cancel → Remove the previous score.
D = Double → Add 2 × previous score.
+ = Sum → Add the previous two scores.

Given: ["5", "-2", "4", "C", "D", "9", "+", "+"]
Example:
5   → [5]
-2  → [5, -2]
4   → [5, -2, 4]
C   → remove 4 → [5, -2]
D   → 2 × (-2) = -4 → [5, -2, -4]
9   → [5, -2, -4, 9]
+   → -4 + 9 = 5 → [5, -2, -4, 9, 5]
+   → 9 + 5 = 14 → [5, -2, -4, 9, 5, 14]

So the final sum is:
5 + (-2) + (-4) + 9 + 5 + 14 = 27

 */