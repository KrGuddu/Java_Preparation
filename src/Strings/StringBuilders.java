package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Guddu");
        System.out.println(s);                          //Guddu
        System.out.println(s.length());                 //5
        System.out.println(s.capacity());               //21        //16+5=21

        s.append("Kumar");
        System.out.println(s);                          //GudduKumar

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());              // Initially/empty string ki capacity 16 hoti hai.
    }
}


/* Q. kya java me stringbuilder arraylist ki tarah kam karta hai kya? jisme jarurat ke hisab se size ko bad skta hai?
Haan 👍 StringBuilder ka size dynamically grow ho sakta hai, isliye is sense mein ye ArrayList jaisa lagta hai. Lekin dono ka purpose alag hai.

Simple comparison:
Feature	                                    StringBuilder	                ArrayList
Store kya karta hai?	                    Characters / text	            Objects
Size dynamically badhta hai?            	✅ Yes	                        ✅ Yes
Indexing	                                charAt(i)	                    get(i)
Add	                                        append()	                    add()
Remove	                                    delete()	                    remove()
Main use	                                String manipulation	            Collection of elements


Example:
StringBuilder sb = new StringBuilder();
sb.append("guddu");
sb.append(" kumar");
sb.append(" java");
System.out.println(sb);

Output:
guddu kumar java

Note: Yahan aapne initially koi size nahi diya, phir bhi StringBuilder required capacity ke according internally grow ho sakta hai.
* */