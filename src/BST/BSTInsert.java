package BST;
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class BSTInsert {
    //1st method: Recursive Approach : Optimal (Recommended)
    Node insert(Node root, int key) {
        if(root==null) return new Node(key);    // Base Case: Empty position found
        if(root.data < key){ // RST me attach karke aao     // Go to right subtree
            root.right = insert(root.right,key);
        }
        else if(root.data > key){ // LST me attach karke aao    // Go to left subtree
            root.left = insert(root.left,key);
        }
        return root;    // Duplicate key: No modification
    }


    //2nd method: By using helper funtion
    // Function to insert a node in a BST.
    // void attach(Node root, int key) {
    //     if (root == null) return;
    //     if (root.data == key) return;
    //     if (root.data < key) {
    //         if (root.right == null) root.right = new Node(key);
    //         else attach(root.right, key);
    //     }
    //     else {  // root.data > data
    //         if (root.left == null) root.left = new Node(key);
    //         else attach(root.left, key);
    //     }
    // }

    // Node insert(Node root, int key) {
    //     if (root == null) return new Node(key);
    //     attach(root, key);
    //     return root;
    // }



    //3rd method: By Iterative Approach
    // Node insert(Node root, int key) {
    //     Node newNode = new Node(key);

    //     if (root == null) return newNode;

    //     Node curr = root;
    //     Node parent = null;

    //     while (curr != null) {
    //         parent = curr;
    //         if (key < curr.data) curr = curr.left;
    //         else if (key > curr.data) curr = curr.right;
    //         else return root;  // Duplicate
    //     }

    //     if (key < parent.data) parent.left = newNode;
    //     else parent.right = newNode;
    //     return root;
    // }
}


/* Complexity Analysis
Let h = height of BST.

Complexity	        Recursive	Iterative
Time	            O(h)	    O(h)
Auxiliary Space	    O(h)	    O(1)
Balanced BST	    O(log n)	O(log n)
Skewed BST	        O(n)	    O(n)


# 2nd method vs 3rd method
Factor	            2nd method	        3rd method
Helper function	    Required	        Not required
Recursion	        Yes	                Yes
Time Complexity	    O(h)	            O(h)
Auxiliary Space	    O(h)	            O(h)
Readability	        Slightly longer	    Cleaner
 */