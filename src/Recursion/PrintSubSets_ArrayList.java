package Recursion;
import java.util.ArrayList;
import java.util.List;

public class PrintSubSets_ArrayList {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subsets("", s, 0, list);
        System.out.println(list);
    }
    private static void subsets(String ans, String s, int idx, List<String> list){
        if(idx==s.length()){
//            list.add(ans);                            //Agar answer empty string ke sath mage to ye use kare
            if(ans.length() != 0) list.add(ans);        //Agar answer without empty string ke mage to ye use kare       //Agar length non zero hai (means empty string hai) tabi list me ans add karna.
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch, s, idx+1, list);      //for pick
        subsets(ans, s, idx+1, list);             //for skip
    }
}
