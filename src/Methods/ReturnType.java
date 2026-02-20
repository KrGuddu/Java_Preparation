package Methods;

public class ReturnType {
    public static int guddu(){
        System.out.println("Vicky");
        System.out.println("Prince");
        return 5;       // 2 meanings of return => 1st: jo v return krege wo current method/function( guddu() ) ke value ban jayegi. 2nd: terminate the current block/function.
    }
    public static void main(String[] args) {
        guddu();        // it only called guddu method/function
        System.out.println("========= 1st method ==========");
        System.out.println(guddu());    //when print the method then it call the method as well as its return value.  //when print the method guddu() then it goes on guddu() method and check its return type(here is int rerun type) and print return type value(here return type value is 5).
        System.out.println("--------------------------");
        System.out.println(-3 + guddu());       // also, we can perform any operations on any method/funtion
        System.out.println("========= 2nd method ==========");

        int x = guddu();        //Also we can store any method values and print them.   //here all values are stored of method guddu()
        System.out.println(x);
    }
}
