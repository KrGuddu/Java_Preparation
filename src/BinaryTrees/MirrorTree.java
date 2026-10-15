//package BinaryTrees;
//
//public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
//}
//public class MirrorTree {
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;            //null ka mirror null hi hota hai.
//
//        // Swap left and right child
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//
//        // Invert left and right subtrees
//        invertTree(root.left);
//        invertTree(root.right);
//
//        return root;


        //SPECIAL METHODS [Ya to dono me left kar do ya right kar do]
//        invertTree(root.left);
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        invertTree(root.left);


//    }
//}



/*
How recursion works
1. root == null → return null (base case).
2. Swap the current node's left and right children.
3. Recursively invert the left subtree.
4. Recursively invert the right subtree.
5. Return root to provide the inverted subtree to the previous recursive call.

Why return root matters: The method's return type is TreeNode, so Java requires a return value on every path that doesn't already return. Without it, your code gives a missing return statement compilation error.

Time and Space Complexity
- Time Complexity: O(n) — every node is visited once.
- Auxiliary Space Complexity: O(h) — recursion stack, where h is the tree height.
  - Balanced tree: O(log n)
  - Skewed tree: O(n)

Revision trick: Invert Binary Tree = Swap children + recursively invert both subtrees + return root.
 */


/*
Que: Kya isme inorder kam karega?
invertTree(root.left);
TreeNode temp = root.left;
root.left = root.right;
root.right = temp;
invertTree(root.right);         //Iss tarah se v code chal skta hai bas, dono me ya to left kar do ya right kar do. Means: [invertTree(root.left); invertTree(root.left);] or [invertTree(root.right); invertTree(root.right);]


Ans: Nhi, Kam nhi karega qki invertTree(root.left) ko swap se pehle call kar diya hai.
Technically, recursion calls aur swap ka order badal sakte ho, lekin agar pehle ek subtree invert karte ho, to swap ke baad usi subtree ko dobara invert karne se bachna hoga.

invertTree(root.left);
invertTree(root.right);
TreeNode temp = root.left;
root.left = root.right;
root.right = temp;

Ye kam karega qki Swap → recursive calls
                  Recursive calls → swap

T.C: O(n) , A.C. O(h)
 */