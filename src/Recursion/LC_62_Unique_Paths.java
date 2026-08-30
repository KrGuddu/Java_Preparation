package Recursion;

public class LC_62_Unique_Paths {
    // public int uniquePaths(int m, int n) {
    //     //1st method (Best): This is give TLE error b/q here is repetation call
    //     if(m==1 || n==1) return 1;          // why return 1? =>B/q of it is only one way.
    //     return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    // }

    //2nd method: TLE error
    public int paths(int cr, int cc, int lr, int lc){   //cr: current row, cc: current column, lr: last row, lc: last column
        if(cr==lr && cc==lc) return 1;
        if(cr>lr || cc>lc) return 0;        //Important //This is for OutOfBoundException       //agar current row, last row se bahar nikal jaye or agar current column, last column ke bahar nikal jaye to return 0 kar do.
        int right = paths(cr, cc+1, lr, lc);    //right jana means current column me ek step/index aage badhna. index of cc is 0, index of cc+1 is i.
        int down = paths(cr+1, cc, lr, lc);
        return right + down;
    }
    public int uniquePaths(int m, int n) {
        return paths(0,0,m-1,n-1);      //current row is 0, current column is 0, last row is m-1, last column is n-1.
    }

    //3rd method: without helper function and reverse ways      //TLE error
    // public int uniquePaths(int m, int n) {
    //     if(m==1 && n==1) return 1;
    //     if(m==0 || n==0) return 0;
    //     return uniquePaths(m, n-1) + uniquePaths(m-1, n);
    // }
}


// Current/initial stage
// last/destination stage