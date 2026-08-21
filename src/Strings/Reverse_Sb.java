//Note: String reverse ko support nhi karta hai but StringBuilder reverse ko support karta hai.
// String and StringBuilder are not support sorting. if we want to sort string then use character array (charArray). By the help of charArray we can sort string or stringBuilder.

package Strings;

public class Reverse_Sb {
    public static void main(String[] args) {
        String s = "guddu";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        collections.sort(sb);         //does not work  //StringBuilder me sorting work nhi karta hai.

        //Function method of reverse StringBuilder      ==>> This 2-pointer reverse technique may be asked in interview.
        int i=0, j=sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;
        }

        System.out.println(sb);
    }
}
