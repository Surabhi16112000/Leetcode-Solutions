class Solution {
    public void rotate(int[][] mat) 
    {
        int n=mat.length;
        
        // finding transpose of the given matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        
        
        // now reverse the elements row-wise
       
        for(int i=0;i<n;i++)
        {
             int l=0, r=n-1;
             while(l<r)
             {
                 int t=mat[i][r];
                 mat[i][r]=mat[i][l];
                 mat[i][l]=t;
                 l++; r--;
             }
        }
        
    }
}