package BinaryTrees;

public class BalancedBinaryTreeCheck {
    //T.C. = O(n)       =>check time and space complexity.
     static boolean flag;
     public boolean isBalanced(Node root) {
         if(root==null) return true;
         flag = true;
         levels(root);
         return flag;
     }
     private int levels(Node root){
         if(root == null) return 0;
         int leftLevels = levels(root.left);
         int rightLevels = levels(root.right);
         if(Math.abs(leftLevels - rightLevels) > 1) flag = false;   //Agar level ka difference 1 se jada hai tab flag ko false bana do.
         return 1 + Math.max(leftLevels, rightLevels);

     }


     //1st method
     //T.C. = O(n^2)     ==> isme dual(2-times) recursion chala     ==> Bad solutions
//    public boolean isBalanced(Node root) {
//        if(root==null) return true;
//        int leftLevels = levels(root.left);
//        int rightLevels = levels(root.right);
//        if(Math.abs(leftLevels-rightLevels) > 1) return false;      //Agar level ka difference 1 se jada hai tab flag ko false bana do.
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//    private int levels (Node root) { // kaam ki cheez
//        if(root==null) return 0;
//        return 1+ Math.max(levels(root.left), levels(root.right));
//    }
}
