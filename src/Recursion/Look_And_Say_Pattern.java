package Recursion;

public class Look_And_Say_Pattern {
//    public String countAndSay(int n) {
//        if(n==1) return "1";
//        String s = countAndSay(n-1);        //Tips: jab question me answer n mage to n-1 do.
//        String ans = "";            //Initially, resume String answer is empty.
//        int i=0, j=0;
//        while(j<s.length()){                    //Agar j sring ki length se chhota hai to loop ke under enter karo
//            if(s.charAt(i)==s.charAt(j)) j++;   //Agar i and j equal stage par hai to j++ kare.
//            else{                               //Otherwise j-i se string ke length/freq nikale and usse ans me store kare And i ki value v ans me store kare. then i ko uthakar j par le jaye.
//                int freq = j-i;
//                ans += freq;
//                ans += s.charAt(i);
//                i=j;
//            }
//        }
//        int freq = j-i;                 //last bala group j++ ke karan terminate ho gya hoga to last bala ko v run karke dekho.
//        ans += freq;
//        ans += s.charAt(i);
//        return ans;
//    }


    //Aur, Agar last ke tino line nhi likhna hai to String me kux v add kar do like #, @ etc.
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1) + "#";           //Tips: jab question me answer n mage to n-1 do.
        String ans = "";                                //Initially, resume String answer is empty.
        int i=0, j=0;
        while(j<s.length()){                           //Agar j sring ki length se chhota hai to loop ke under enter karo
            if(s.charAt(i)==s.charAt(j)) j++;          //Agar i and j equal stage par hai to j++ kare.
            else{                                      //Otherwise j-i se string ke length/freq nikale and usse ans me store kare And i ki value v ans me store kare. then i ko uthakar j par le jaye.
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i=j;
            }
        }
        return ans;
    }
}
