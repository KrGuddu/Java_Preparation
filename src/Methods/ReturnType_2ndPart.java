package Methods;

public class ReturnType_2ndPart {
    public static int guddu(int a){
        System.out.println("Vicky");
        if(a>0) return 5;   // Agr ye true hua to value return 5 nhi krega balki method guddu() ki value 5 ho jayegi (like: return 5).
        else return 10;
    }
    public static void main(String[] args) {
        int x = guddu(7);   // x=5 ho jayegi na ki x=7
        System.out.println(3+x);    //3+5=8
    }
}
