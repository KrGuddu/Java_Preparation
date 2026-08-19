package Strings;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Guddu";
        char[] arr = s.toCharArray();
        for (char ch : arr){
            System.out.println(ch);
        }
    }
}


//isTareekeKoHumCamelCaseKahteHai : camel case conversion
//IsTareekeKoHumPascalCaseKahteHai : Pascal Case conversion