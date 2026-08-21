package Strings.SubStrings;

public class SubStringsOfString {
    public static void main(String[] args) {
        String s = "Abhishek Kumar";
        System.out.println(s.substring(4,8));               //shek          //In substring fist index number is included and last index number is excluded. So, last index number is not count.
        System.out.println(s.substring(4,14));              //shek Kumar
        System.out.println(s.substring(4));       //shek Kumar
        System.out.println(s.substring(0));       //Abhishek Kumar      //Warnig: Call to 'substring()' is redundant  ==>> redundant means unnecessary.
        System.out.println(s.substring(14));      //Kux v nhi print hoga qki last index number 13 hai, index number 14 present hi nhi hai. By default s.length+1 ka value always 0 hoti hai qki s.length+1 string ke bahar chala jata hai.
        System.out.println(s.substring(13));      //r ==> qki 13 last index number hai jiski value r hai.
        System.out.println(s.substring(9));       //Kumar
        System.out.println(s.substring(3,s.length()));      //ishek Kumar       //Warnig: Unnecessary string length argument or redundant
        System.out.println(s.substring(3,s.length()-1));    //ishek Kuma
        System.out.println(s.substring(-5));      //Error: StringIndexOutOfBoundsException
        System.out.println(s.substring(-5,-9));             //Error: StringIndexOutOfBoundsException
        System.out.println(s.substring(-5,9));              //Error: StringIndexOutOfBoundsException

    }
}
