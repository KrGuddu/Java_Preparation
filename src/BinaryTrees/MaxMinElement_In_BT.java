/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

//package BinaryTrees;
//
//public class MaxMinElement_In_BT {
//    public static int findMax(Node root) {
//        if(root==null) return Integer.MIN_VALUE;
//        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
//    }
//    public static int findMin(Node root) {
//        if(root==null) return Integer.MAX_VALUE;
//        return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
//    }
//}



/* Kaise kaam karta hai?
Har node par 3 values compare hoti hain:
- root.data — current node ki value
- findMax(root.left) — left subtree ki maximum value
- findMax(root.right) — right subtree ki maximum value

findMin() bhi isi tarah minimum value find karta hai.

Complexity
Complexity	                Value
Time	                    O(n)
Auxiliary Space	            O(h)
Worst-case Space	        O(n)

Yahan n total nodes aur h tree ki height hai.
 */



/* Extra:
1. Standard recursive DFS
- DFS (Depth-First Search): Graph ya tree mein nodes ko depth-wise visit karna.
- Recursive: Function khud ko call karta hai.
- Every node: Algorithm kisi bhi node ko skip nahi karta; sabhi nodes visit karta hai.

2. Θ(n) runtime ka meaning
Yahan:
- n = total number of nodes.
- Θ(n) = algorithm ka runtime input size ke proportional grow karta hai.

Nodes(n)	Approx. node visits
10	        10
100	        100
1,000	    1,000
10,000	    10,000

Agar nodes ki sankhya 10 times badhe, to node visits bhi approximately 10 times badhenge.

3. Example
void dfs(TreeNode root) {
    if (root == null) {
        return;
    }

    dfs(root.left);
    dfs(root.right);
}


Agar tree mein 7 nodes hain, to DFS har node ko ek baar process karega.
- Time Complexity: Θ(n)
- Space Complexity: O(h), jahan h tree ki height hai, kyunki recursive calls call stack mein store hoti hain.

4. Θ(n), O(n) aur Ω(n) mein difference
- O(n): Upper bound — runtime isse zyada grow nahi karta asymptotically.
- Ω(n): Lower bound — runtime kam-se-kam linear grow karta hai.
- Θ(n): Tight bound — runtime upper aur lower, dono taraf se linear hai.

Important: Jab DFS ko har node visit karna zaroori hai aur har node par constant work hota hai, tab time complexity Θ(n) hoti hai.
Ek clarification: Agar DFS graph par hai, to aam taur par complexity Θ(V+E) hoti hai, jahan V nodes aur E edges hain. Tree mein E=V-1, isliye complexity Θ(n) hoti hai.
 */
