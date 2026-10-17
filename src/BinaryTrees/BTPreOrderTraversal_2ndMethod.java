package BinaryTrees;
import java.util.ArrayList;
import java.util.List;

public class BTPreOrderTraversal_2ndMethod {
    //2nd method
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        if (root == null) return ans;           //important
//
//        Stack<TreeNode> st = new Stack<>();
//        st.push(root);
//
//        while(st.size()>0){
//            TreeNode top = st.pop();
//            ans.add(top.val);
//            // Right first, then left
//            if(top.right!=null) st.push(top.right);
//            if(top.left!=null) st.push(top.left);
//        }
//        return ans;
//    }


    //1st method
    // public void dfs(TreeNode root, ArrayList<Integer> ans) {
    //     if(root == null) return;
    //     ans.add(root.val);
    //     dfs(root.left, ans);
    //     dfs(root.right, ans);
    // }
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     dfs(root, ans);
    //     return ans;
    // }
}
