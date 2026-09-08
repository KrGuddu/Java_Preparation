package OOPs;

public class Method_Overloading {
    public static int max(int a, int b){
        return Math.max(a,b);
    }
    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }
    public static void main(String[] args) {
        System.out.println(Math.max(4,5));                  //It point [int a, int b]
        System.out.println(Math.max(4, Math.max(5,6)));     //It point [int a, int b, int c]
    }
}
