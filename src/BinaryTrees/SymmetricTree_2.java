//By recursion  =>Best

//package BinaryTrees;
//
//public class SymmetricTree_2 {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return isMirror(root.left, root.right);
//    }
//
//    public boolean isMirror(TreeNode left, TreeNode right) {
//        if (left == null && right == null) return true;
//        if (left == null || right == null) return false;
//        if (left.val != right.val) return false;
//
//        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
//    }
//}


/*
                   1
                /    \
               2       2
             /   \    /  \
            3     4  4    3

The function compares mirror positions, not same-side children:
1. left.left ↔ right.right → 3 == 3
2. left.right ↔ right.left → 4 == 4
3. Both subtrees must be symmetric, so we use &&.

Important cases
- Both nodes are null → true
- Only one node is null → false
- Values differ → false
- Otherwise, compare the two cross-side pairs recursively.

Complexity
- Time: O(n) — each node is visited at most once.
- Auxiliary space: O(h) — recursion stack, where h is tree height.

Revision trick: Symmetric Tree = left.left with right.right, and left.right with right.left.
 */