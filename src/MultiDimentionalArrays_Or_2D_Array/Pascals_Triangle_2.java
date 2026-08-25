package MultiDimentionalArrays_Or_2D_Array;
import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_2 {
    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) ans.get(i).add(1);          //arr[i][j] = 1
                else{
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);       //val = arr[i-1][j] + arr[i-1][j-1]
                    ans.get(i).add(val);
                }
            }
        }
        return ans.get(rowIndex);       //It will return particular row with all elements.


        //2nd method: ncr ==>> Best, But isme 2D Array ka koe sense nhi rahega.
    }
}
