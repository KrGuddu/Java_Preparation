package BinaryTrees;

public class LCA_In_BT {
    //On GFG
//    Node lca(Node root, int p, int q) {   // TC = O(n)
//        if(root==null) return null;
//        if(root.data==p || root.data==q) return root;
//        Node l = lca(root.left,p,q);
//        Node r = lca(root.right,p,q);
//        if(l!=null && r!=null) return root;
//        return (l==null) ? r : l;
//    }


    //On LeetCode
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        // Base case
//        if(root==null) return null;
//
//        // If current node is p or q
//        if(root==p || root==q) return root;           //chuki (root.val==p) ye wrong statement hai qki root ek TreeNode and p ek integer value hai and (TreeNode != Integer) so, (root==p) right statement hai.
//
//        // Search in left and right subtrees
//        TreeNode l = lowestCommonAncestor(root.left,p,q);
//        TreeNode r = lowestCommonAncestor(root.right,p,q);
//
//        // p and q found in different subtrees
//        if(l!=null && r!=null) return root;
//
//        // Return the non-null result
//        return (l==null) ? r : l;
//
//    /* Complexity
//        - Time Complexity: O(n) — in the worst case, each node is visited once.
//        - Auxiliary Space Complexity: O(h) — recursion stack, where h is the tree height. Worst case O(n); balanced tree O(log n).
//     */
//
//    }
}
