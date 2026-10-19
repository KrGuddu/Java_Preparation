package BinaryTrees;

public class ConstructTreeFromInAndPre {
    public static Node buildTree(int inorder[], int preorder[]) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);
    }
    public static Node build(int preLo, int preHi, int inLo, int inHi, int inorder[], int preorder[]) {
        if(preLo > preHi || inLo > inHi) return null;
        int val = preorder[preLo];
        Node root = new Node(val);
        int r = 0;
        for(int i=inLo;i<=inHi;i++){ // locating root in inorder array
            if(inorder[i]==val){
                r = i;
                break;
            }
        }
        int cnt = r - inLo; // Number of elements in LST
        root.left = build(preLo+1,preLo+cnt,inLo,r-1,inorder,preorder);
        root.right = build(preLo+cnt+1,preHi,r+1,inHi,inorder,preorder);
        return root;
    }
}


/*
Note: Agar sirf ek preorder diya jata hai tab iss preorder se bahut sara tree banaya ja skta hai.      [4:18:15]
      Similarly, Agar sirf ek inorder diya jata hai tab iss inorder se bahut sara tree banaya ja skta hai.
      But, Agar ek preorder and ek inorder diya hua hai to sirf ek hi tree banaya ja skta hai.
      Kya Binary tree ki inorder se root identify kar skte hai?   ==> Ans: No         [inorder structure: LST, root, RST]
      Kya Binary tree ki preorder se root identify kar skte hai?   ==> Ans: Yes, qki root 1st position par honge         [preorder structure: root, LST, RST]
      Kya Binary tree ki postorder se root identify kar skte hai?   ==> Ans: Yes, qki root last position par honge      [postorder structure: LST, RST, root]

For Base case: How to make balanced binary tree from the sorted array?      [4:48:50] [4:51:00]
 */