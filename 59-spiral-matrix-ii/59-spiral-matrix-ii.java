class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][] mat=new int[n][n];
        int l=0, r=n-1, up=0, down=n-1;
        int num=1;
        int op=0;
        while(l<=r && up<=down)
        {
            if(op==0)
            {
                for(int i=l;i<=r;i++)
                {
                    mat[up][i]=num++;
                }
                up++;
                
                
            }
            else if(op==1)
            {
                for(int i=up;i<=down;i++)
                {
                    mat[i][r]=num++;
                }
                r--;
            }
            else if(op==2)
            {
                for(int i=r;i>=l;i--)
                {
                    mat[down][i]=num++;
                }
                down--;
            }
            else if(op==3)
            {
                for(int i=down;i>=up;i--)
                {
                    mat[i][l]=num++;
                }
                l++;
            }
            op=++op%4;
        }
        return mat;
    }
}