//compare both solutions which one is perfect, and what is the best solution?

package BST;

public class kthSmallestInBST {
    //2nd method    =>good                  //solve without global variables: important for interview
    static int ans;
    static int k2;
    public void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        k2--;
        if(k2==0) ans = root.data;
        inorder(root.right);
    }
    public int kthSmallest(Node root, int k) {
        k2 = k;
        ans = -1;
        inorder(root);
        return ans;
    }


    //1st method
    // public void inorder(Node root, ArrayList<Integer> arr) {
    //     if(root==null) return;
    //     inorder(root.left,arr);
    //     arr.add(root.data);
    //     inorder(root.right,arr);
    // }
    // public int kthSmallest (Node root, int k) {
    //     ArrayList<Integer> arr = new ArrayList();
    //     inorder(root,arr);
    //     if(arr.size()<k) return -1;
    //     return arr.get(k-1);
    // }
}
