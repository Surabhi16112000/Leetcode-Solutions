class NumMatrix {
    int[][] ans;
    public NumMatrix(int[][] ans) 
    {
        int n=ans.length;
        //ans=new int[n][ans[0].length];
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<ans[0].length;j++)
            {
                ans[i][j]=ans[i][j-1]+ans[i][j];
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                ans[i][j]=ans[i-1][j]+ans[i][j];
            }
        }
        this.ans=ans;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        int total=ans[row2][col2];
        int extra=0;
        if(col1!=0)
        {
            extra+=ans[row2][col1-1];
        }
        if(row1!=0)
        {
            extra+=ans[row1-1][col2];
        }
        if(col1!=0 && row1!=0)
        {
            extra=extra-ans[row1-1][col1-1];
        }
        return total-extra;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */