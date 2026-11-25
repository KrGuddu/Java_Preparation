package BST;

public class LCAInBST {
    //TC:- In Worst Case: O(level) or O(N), In Average Case O(log N)
    public Node findLCA(Node root, Node p, Node q) {
        if(root.data>p.data && root.data>q.data) return findLCA(root.left, p, q);           //if root is greather than p and q then go left
        else if(root.data<p.data && root.data<q.data) return findLCA(root.right, p, q);     //if root is smaller than p and q then go right
        else return root;                                                                   //otherwise, unique root value is lie b/w p and q so it return it.
    }
}


/* Time complexity:
TC: O(level) is conceptually right because the algorithm visits at most one node per level as it moves down the tree. However, in standard algorithm analysis, it is expressed in terms of height(H) or number of nodes(N):
• Average Case (Balanced BST): O(log N), where N is the number of nodes in the tree. Because each recursive call eliminates half of the remaining tree, the height H is logarithmic.
• Worst Case (Skewed BST): O(N). If the tree is completely skewed (resembling a linked list) and the target nodes are at the bottom, the function will visit every node down a single path, making H=N.

Space Complexity
• O(H) due to the recursion call stack (which translates to O(log N) in the average case and O(N) in the worst case).
 */