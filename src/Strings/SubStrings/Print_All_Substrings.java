package Strings.SubStrings;

public class Print_All_Substrings {
    public static void main(String[] args) {
        String s = "Guddu";
        int sum = 0;

        //for column form/table form o/p
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
                sum = i+j;
            }
        }
        System.out.println(sum);


        //for Diamond shape o/p
//        for(int i=0; i<s.length(); i++){
//            for(int j=i+1; j<=s.length(); j++){
//                System.out.print(s.substring(i,j) + " ");
//                sum = i+j;
//            }
//            System.out.println(sum);
//        }

    }
}
