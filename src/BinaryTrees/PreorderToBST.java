package BinaryTrees;
import java.util.Arrays;

public class PreorderToBST {
    //GFG Solutions
//    public Node preToBST(int pre[]) {
//        int n = pre.length;
//        int[] inorder = Arrays.copyOf(pre,n);
//        Arrays.sort(inorder);
//        return build(0,n-1,0,n-1,inorder,pre);
//    }
//
//    public static Node build(int preLo, int preHi, int inLo, int inHi, int inorder[], int preorder[]) {
//        if(preLo > preHi || inLo > inHi) return null;
//        int val = preorder[preLo];
//        Node root = new Node(val);
//        int r = inLo;
//        for(int i=inLo;i<=inHi;i++){  // locating root in inorder array
//            if(inorder[i]==val){
//                r = i;
//                break;
//            }
//        }
//        int cnt = r - inLo; // Number of elements in LST
//        root.left = build(preLo+1,preLo+cnt,inLo,r-1,inorder,preorder);
//        root.right = build(preLo+cnt+1,preHi,r+1,inHi,inorder,preorder);
//        return root;
//    }
    // TC=O(n²) worst case;  AS = O(n) for the sorted copy and recursion stack.



    //Leetcode Solution
//    public TreeNode bstFromPreorder(int[] preorder) {
//        int n = preorder.length;
//        int[] inorder = Arrays.copyOf(preorder, n);
//        Arrays.sort(inorder);
//        return build(0, n - 1, 0, n - 1, inorder, preorder);
//    }
//
//    public TreeNode build(int preLo, int preHi, int inLo, int inHi, int[] inorder, int[] preorder) {
//        if (preLo > preHi || inLo > inHi) return null;
//        int val = preorder[preLo];
//        TreeNode root = new TreeNode(val);
//        int r = inLo;
//
//        for (int i = inLo; i <= inHi; i++) {    // Find root in inorder
//            if (inorder[i] == val) {
//                r = i;
//                break;
//            }
//        }
//        int cnt = r - inLo;     // Number of elements in LST
//        root.left = build(
//                preLo + 1, preLo + cnt,
//                inLo, r - 1,
//                inorder, preorder
//        );
//
//        root.right = build(
//                preLo + cnt + 1, preHi,
//                r + 1, inHi,
//                inorder, preorder
//        );
//
//        return root;
//    }
    // Complexity
    // - Time: O(n²) worst case, kyunki har recursive call mein inorder array search hota hai.
    // - Space: O(n) for the copied and sorted array, plus recursion stack.
}
