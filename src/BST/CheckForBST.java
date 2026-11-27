//Check this code, TC, SC

package BST;

class Triplet{
    int max;
    int min;
    boolean isBST;
    Triplet(int max, int min, boolean isBST){
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}
public class CheckForBST {
    boolean isBST(Node root) {
        return maxMin(root).isBST;
    }
    Triplet maxMin(Node root){
        if(root==null) return new Triplet(Integer.MIN_VALUE,Integer.MAX_VALUE,true);
        Triplet lst = maxMin(root.left);
        Triplet rst = maxMin(root.right);
        int max = Math.max(root.data,Math.max(lst.max,rst.max));    //maximum of lst, root and rst
        int min = Math.min(root.data,Math.min(lst.min,rst.min));    //minimum of lst, root and rst
        boolean isBST = lst.isBST && rst.isBST && (lst.max < root.data) && (rst.min > root.data);
        return new Triplet(max,min,isBST);
    }
}


//for Long datatype
// class Pair {
//     long max;
//     long min;
//     Pair(long max, long min) {
//         this.max = max;
//         this.min = min;
//     }
// }
//public class CheckForBST {
//     static boolean flag;
//     boolean isBST(Node root) {
//         flag = true;
//         maxMin(root);
//         return flag;
//     }
//     Pair maxMin(Node root) {
//         if (root == null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
//         Pair lst = maxMin(root.left);        //here, Pair is return type
//         Pair rst = maxMin(root.right);
//         long data = root.data;
//         long max = Math.max(data, Math.max(lst.max, rst.max));
//         long min = Math.min(data, Math.min(lst.min, rst.min));
//         if (lst.max >= data || rst.min <= data) flag = false;
//         return new Pair(max, min);
//     }
// }