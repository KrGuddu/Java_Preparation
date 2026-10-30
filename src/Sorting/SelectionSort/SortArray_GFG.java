package Sorting.SelectionSort;

public class SortArray_GFG {

}

/*
1. Comparison
Criteria	        Selection Sort	        Optimised Bubble Sort
Best Time	        \(O(n^2)\)	            \(O(n)\)
Average Time	    \(O(n^2)\)	            \(O(n^2)\)
Worst Time	        \(O(n^2)\)	            \(O(n^2)\)
Swaps	            At most \(n-1\)	        Can be \(O(n^2)\)
Auxiliary Space	    \(O(1)\)	            \(O(1)\)
Stable	            No	                    Yes
Adaptive	        No	                    Yes

2. Check GFG constraints
GFG specifies:
- Array size: \(1 \leq n \leq 10^5\)
- Expected Time Complexity: \(O(n\log n)\)
- Expected Auxiliary Space: \(O(1)\).

So, for this particular problem, neither of your two solutions is the best choice.

3. My recommendation
Algorithm	                Recommendation
Selection Sort	            Learn, but don't use here
Optimised Bubble Sort	    Learn, but don't use here
Merge Sort	                Good, but uses \(O(n)\) auxiliary space
Heap Sort	                Best fit (Meets both expected complexities)
Java Arrays.sort()	        Practical built-in solution


4. Heap Sort – Java solution
Complexity:
- Best: \(O(n\log n)\)
- Average: \(O(n\log n)\)
- Worst: \(O(n\log n)\)
- Auxiliary Space: \(O(\log n)\) for recursive heapify due to recursion stack.

Note: This recursive implementation does not strictly achieve \(O(1)\) auxiliary space. An iterative heapify would achieve that.
     */
