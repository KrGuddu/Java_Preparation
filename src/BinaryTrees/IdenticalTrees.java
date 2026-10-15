//package BinaryTrees;
//
//public class IdenticalTrees {
//    public boolean isIdentical(Node r1, Node r2) {
//        if(r1==null && r2==null) return true;
//        if(r1==null || r2==null) return false;
//        if(r1.data != r2.data) return false;
////        if(!isIdentical(r1.left, r2.left)) return false;            //or, if(isIdentical(r1.left, r2.left)==false) return false;
////        if(!isIdentical(r1.right, r2.right)) return false;          //or, if(isIdentical(r1.right, r2.right)==false) return false;
////        return true;
//
//        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);        //or, In one line       => Best
//    }
//}
