//Important questions for interview

package Recursion;
import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public void generate(int n, int l, int r, String s, List<String> ans){
        if(r==n){       //base case  //or:  s.length() == 2*n     //Ham n tak pahuch gaye hai menas mujhe valid paranthesis mil chuka hai so ans me string s ko add karke return kar denge.
            ans.add(s);
            return;
        }
        if(l < n) generate(n, l+1, r, s+"(", ans);
        if(r < l) generate(n, l, r+1, s+")", ans);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        System.out.println(ans);
        return ans;
    }
}
