package BinaryTrees;
import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal_2ndMethod {
    //2nd method
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        Stack<TreeNode> st = new Stack<>();
//        TreeNode curr = root;
//
//        while(st.size()>0 || curr!=null){
//            if(curr!=null){
//                if(curr.left!=null){
//                    st.push(curr);
//                    curr = curr.left;
//                }
//                else{
//                    ans.add(curr.val);
//                    curr = curr.right;
//                }
//            }
//            else{ // curr == null
//                TreeNode top = st.pop();
//                ans.add(top.val);
//                curr = top.right;
//            }
//        }
//        return ans;
//    }

    //1st method
    // public void dfs(TreeNode root, ArrayList<Integer> ans) {
    //     if(root == null) return;
    //     dfs(root.left, ans);
    //     ans.add(root.val);
    //     dfs(root.right, ans);
    // }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     dfs(root, ans);
    //     return ans;
    // }
}
