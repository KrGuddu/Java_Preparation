package BST;

//public class SearchInBST {
//    public boolean search(Node root, int key) {
//        if(root==null) return false;
//        if(root.data == key) return true;
//        else if(root.data > key ) return search(root.left, key);    //here, search(root.left, key); is recursion call
//        else return search(root.right, key);
//    }
//}


/* Complexity Analysis
Complexity	            Recursive BST Search
Best Case	            O(1)
Average Case	        O(log n), for reasonably balanced BST
Worst Case	            O(n), for skewed BST
Auxiliary Space	        O(h), recursion stack
 */