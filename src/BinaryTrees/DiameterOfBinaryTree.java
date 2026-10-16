package BinaryTrees;

public class DiameterOfBinaryTree {
    static int max;
    public int diameter(Node root) {
        max = 0;
        levels(root);
        return max;
    }

    private int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        max = Math.max(max,leftLevels + rightLevels); // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
