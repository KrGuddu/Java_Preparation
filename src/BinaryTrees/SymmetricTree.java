package BinaryTrees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {             //Question me sirf ye class diya hai
        invertTree(root.left);                //Also we can write "root.right".  =>dono me se koe ek likho.
        return isSameTree(root.left, root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
