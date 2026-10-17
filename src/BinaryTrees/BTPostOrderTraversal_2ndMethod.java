package BinaryTrees;
import java.util.ArrayList;
import java.util.List;

public class BTPostOrderTraversal_2ndMethod {
    //2nd method
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        if (root == null) return ans;           //important
//
//        Stack<TreeNode> st = new Stack<>();
//        st.push(root);
//
//        while(st.size()>0){
//            TreeNode top = st.pop();
//            ans.add(top.val);
//            // left first, then right
//            if(top.left!=null) st.push(top.left);
//            if(top.right!=null) st.push(top.right);
//        }
//        Collections.reverse(ans);
//        return ans;
//    }


    //1st method
    // public void dfs(TreeNode root, ArrayList<Integer> ans) {
    //     if(root == null) return;
    //     dfs(root.left, ans);
    //     dfs(root.right, ans);
    //     ans.add(root.val);
    // }
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     dfs(root, ans);
    //     return ans;
    // }
}
