package BST;

public class ArrayToBST {
    public Node sortedArrayToBST(int[] arr) {
        int n = arr.length;
        return convert(arr,0,n-1);
    }
    public Node convert(int[] arr, int lo, int hi) {
        if(lo>hi) return null;      //jab low high se aage nikal jaye to null store ho jayega
        int mid = (lo+hi)/2;
        Node root = new Node(arr[mid]);
        root.left = convert(arr,lo,mid-1);
        root.right = convert(arr,mid+1,hi);
        return root;
    }
}



/*
Interview recommendation: Your ArrayList + Binary Search approach is a good solution. Remember that the O(n) inorder simulation approach can construct the BST directly from the linked list without storing all elements in an array or ArrayList.
My verdict: Keep the ArrayList approach as your first solution. Learn Inorder Simulation as your optimized second solution, because it avoids storing all linked-list elements separately.
 */