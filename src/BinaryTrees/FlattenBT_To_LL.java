package BinaryTrees;

public class FlattenBT_To_LL {
    //Using recursion
    public static void flatten(Node root) {
        if(root==null) return;
        Node lst = root.left;
        Node rst = root.right;
        root.left = null;
        // root.right = null;       //It's fine if i don't write it.
        flatten(lst);
        flatten(rst);
        root.right = lst;
        Node last = root; // ye lst ka last element hoga
        while(last.right!=null) last = last.right;
        last.right = rst;
    }

    //1st method        TC = O(n),  AC = O(n)
    // public static void flatten(Node root) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     dfs(root,arr);
    //     for(int i=0;i<arr.size()-1;i++){
    //         Node a = arr.get(i);
    //         Node b = arr.get(i+1);
    //         a.right = b;
    //         a.left = null;
    //     }
    //     Node last = arr.get(arr.size()-1);
    //     last.left = null;
    //     last.right = null;
    // }

    // private static void dfs(Node root, ArrayList<Node> arr) {
    //     if(root==null) return;
    //     arr.add(root);
    //     dfs(root.left,arr);
    //     dfs(root.right,arr);
    // }
}


/*
// root.right = null;       //It's fine if i don't write it.

Haan, root.right = null likhna zaroori nahi hai, kyunki tum baad mein root.right = lst se purana right reference replace kar dete ho. Lekin tumhare recursive method mein root.right = lst se pehle left subtree flatten hoti hai, isliye code ka order samajhna important hai.
Tumhara recursive method correct hai, lekin har node par while(last.right != null) se flattened left subtree ke end tak jaana padta hai. Worst case mein iska time complexity \(O(n^2)\) ho sakta hai.
Recommendation: Filhaal ArrayList wala method rakho. Jab \(O(1)\) auxiliary space seekhna ho, tab reverse preorder recursion ya iterative pointer approach practice karna.
 */