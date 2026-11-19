//package BST;
//
//public class CountBSTNodesInRange {
//    /* Range
//    1st part: -∞ to l
//    2nd part: l to h
//    3rd part: h to +∞
//     */
//    int getCount(Node root, int l, int h) {
//        if(root == null) return 0;
//        if(root.data < l) return getCount(root.right, l, h);            // Current node is smaller than range
//        else if(root.data > h) return getCount(root.left, l, h);        // Current node is greater than range
//        else{   //l <= root.data <= h                                   // Current node is within range
//            return 1 + getCount(root.right, l, h) + getCount(root.left, l, h);
////            return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);       // this is for leetcode
//        }
//    }
//}
