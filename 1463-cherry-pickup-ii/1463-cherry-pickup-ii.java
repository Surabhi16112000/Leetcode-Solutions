class Solution {
    int[][][] dp=null;
    public int cherryPickup(int[][] A) 
    {
        
        int r=A.length;
        int c=A[0].length;
        dp=new int[r][c][c];
        return solve(0,0,c-1,r,c,A);
        
    }
    
    public int solve(int i, int j1, int j2, int row, int col, int[][] A)
    {
        if(i>=row || j1<0 || j1>=col || j2<0 || j2>=col)
        {
            return Integer.MIN_VALUE;
        }
        if(dp[i][j1][j2]!=0) return dp[i][j1][j2];
        if(i==row-1)
        {
            if(j1==j2) return A[i][j1];
            else return A[i][j1]+A[i][j2];
        }
        int max=Integer.MIN_VALUE;
        for(int s1=-1;s1<=1;s1++)
        {
            for(int s2=-1;s2<=1;s2++)
            {
                int temp=0;
                if(j1==j2) temp=A[i][j1];
                else temp=A[i][j1]+A[i][j2];
                temp+= solve(i+1, j1+s1 , j2+s2, row, col, A);
                max=Math.max(max,temp);
            }
        }
        return dp[i][j1][j2]=max;
    }
}