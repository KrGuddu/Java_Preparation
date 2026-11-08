package TwoPointers;/* Problem Understanding:
You are given an integer array height, where each element represents the height of a vertical line.
You need to find two lines that, together with the x-axis, form a container that holds the maximum amount of water.

Formula:
Area = Width x Height

Where:
Width = j-i
Height = min(arr[i], arr[j])

Therefore:
Area = (j-i) x min(arr[i], arr[j])
 */


public class ContainerWithMostWater {
    public int maxWater(int arr[]) {    //in leetcode maxArea
        int i = 0, j = arr.length - 1;
        int maxArea = 0;

        while (i < j) {
            int width = j - i;
            int minHeight = Math.min(arr[i], arr[j]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            if (arr[i] < arr[j]) i++;
            else j--;
        }
        return maxArea;
    }
}


/*
Time Complexity: O(n)	=> Both pointers traverse the array at most once
Auxiliary Space: O(1)   => Only a few variables are used


In gfg: The problem constraints allow up to \(10^5\) elements, so the O(n²) brute-force approach is inefficient.


# Dry Run
Input:
height = [1,8,6,2,5,4,8,3,7]

Step	i	j	Left	Right	Width	Area	Action
1	    0	8	1	    7	    8	    8	    i++
2	    1	8	8	    7	    7	    49	    j--
3	    1	7	8	    3	    6	    18	    j--
4	    1	6	8	    8	    5	    40	    j--
5	    1	5	8	    4	    4	    16	    j--
6	    1	4	8	    5	    3	    15	    j--
7	    1	3	8	    2	    2	    4	    j--
8	    1	2	8	    6	    1	    6	    j--

O/P: Maximum Area = 49
*/