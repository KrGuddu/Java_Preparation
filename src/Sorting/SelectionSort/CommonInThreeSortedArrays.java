package Sorting.SelectionSort;
import java.util.ArrayList;

public class CommonInThreeSortedArrays {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        int i=0, j=0, k=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length && k<c.length){
            if(a[i]==b[j] && b[j]==c[k]){
                // ans.add(a[i]);
                if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {        // avoid duplicates
                    ans.add(a[i]);
                }
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j] && a[i]<c[k]) i++;
            else if(b[j]<a[i] && b[j]<c[k]) j++;
            else k++;
        }
        return ans;
    }
}


/*
Pattern: Three Pointers / Multi-pointer Technique.

Solutions rules:
1. All arrays must be sorted for this approach.
2. If all three elements match, add the element.
3. If elements don't match, move a pointer holding the smallest element.
4. Handle duplicates to avoid repeated answers.
5. Stop when any one array is exhausted.
 */



/* Explanations:-
if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
    ans.add(a[i]);
}

Isko 2 parts mein samjho.
1. ans.isEmpty()    : Check karta hai ki ArrayList empty hai ya nahi.
- Empty hai → true
- Empty nahi hai → false
Pehli baar jab common element milega, ans empty hoga, isliye element add ho jayega.

2. ans.get(ans.size()-1) != a[i]
Iska meaning:
- ans.size() → ArrayList mein total elements.
- ans.size()-1 → Last element ka index.
- ans.get(ans.size()-1) → Last element ki value.
- != a[i] → Check karta hai ki last element aur current element different hain ya nahi.


Summary:
if(ans.isEmpty() || ans.get(ans.size()-1) != a[i])

Meaning:
1. Agar ArrayList empty hai → element add karo.
2. Agar last element current element se different hai → element add karo.
3. Agar same hai → duplicate skip karo.

-Ye trick sorted data mein consecutive duplicates avoid karne ke liye useful hai.


3. Dry Run
Suppose:
a = [1, 1, 1, 2, 3]
b = [1, 1, 2, 3]
c = [1, 1, 2, 3]

Jab common element milta hai:
Current a[i]	ans before	    Condition	        Operation
1	            []	            true (empty)	    Add 1
1	            [1]	            1 != 1 → false	    Skip
2	            [1]	            1 != 2 → true	    Add 2
3	            [1, 2]	        2 != 3 → true	    Add 3

Final answer:
ans = [1, 2, 3]
 */


/*
Complexity	                Value	                Reason
1. Time	                    O(n1+n2+n3)	            Each pointer moves only forward.
2. Auxiliary Space	        O(1)	                Only three pointers and variables.
3. Output Space	            O(min(n1,n2,n3))	    Result ArrayList.
 */