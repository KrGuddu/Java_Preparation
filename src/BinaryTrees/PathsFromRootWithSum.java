//package BinaryTrees;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PathsFromRootWithSum {
//    //On gfg =>isme sare test case nhi diye hue hai.
//    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        ArrayList<Integer> arr = new ArrayList<>();
//        dfs(root,arr,ans,sum);
//        return ans;
//    }
//    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum) {
//        if (root == null) return;       //Don't forgat to adding base to avoid NullPointerException
//        arr.add(root.data);
//        // If current path sum matches, add it
//        if (sum == root.data) {
//            ans.add(new ArrayList<>(arr));
//        }
//        // Continue searching children
//        if (root.left != null) dfs(root.left, arr, ans, sum - root.data);
//        if (root.right != null) dfs(root.right, arr, ans, sum - root.data);
//        arr.remove(arr.size() - 1); // backtrack
//    }
//
//    //On leetcode           =>Best
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> arr = new ArrayList<>();
//        dfs(root,arr,ans,targetSum);
//        return ans;
//    }
//    private static void dfs(TreeNode root, List<Integer> arr, List<List<Integer>> ans, int sum) {
//        if (root == null) return;       //Don't forgat to adding base to avoid NullPointerException
//        arr.add(root.val);
//
//        // Check whether current node is a leaf
//        if (root.left == null && root.right == null && sum == root.val) {
//            ans.add(new ArrayList<>(arr));
//        }
//
//        // Continue searching children
//        dfs(root.left, arr, ans, sum - root.val);
//        dfs(root.right, arr, ans, sum - root.val);
//
//        arr.remove(arr.size() - 1); // backtrack
//    }
//}
//
//
//
///*
//Complexity
//- Time: O(N + N*H) worst-case, where N is the number of nodes and H is tree height. More commonly, path-copying cost is expressed as O(NH) in the worst case.
//- Auxiliary space: O(H) for recursion and the current path, excluding the output.
// */
//
//
///*
//Important concepts:
//- sum - root.val: remaining target calculate karta hai.
//- new ArrayList<>(arr): current path ki independent copy save karta hai.
//- arr.remove(arr.size() - 1): backtracking ke through previous path restore karta hai.
//- Leaf node: aisa node jiska left aur right, dono null hon.
// */