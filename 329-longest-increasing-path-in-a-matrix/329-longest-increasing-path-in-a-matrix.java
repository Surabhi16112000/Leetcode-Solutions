class Solution {
    int row,col;
    int[][] cache;
    int[][] dirs={{-1,0},{0,-1},{1,0},{0,1}};
    int longestIncPath(int[][]a, int r, int c)
    {
        if(r<0 || r>=row || c<0 || c>=col) return 0;
        if(cache[r][c]!=-1) return cache[r][c];
        
        int path=0;
        for(int[] dir: dirs)
        {
            int dir_i = r+dir[0];
            int dir_j = c+dir[1];
            if(dir_i<0 || dir_i>=row || dir_j<0 || dir_j>=col || a[dir_i][dir_j]>a[r][c])
            {
                path=Math.max(path,longestIncPath(a,dir_i,dir_j));
            }
        }
        return cache[r][c]=1+path;
    }
    public int longestIncreasingPath(int[][] a) 
    {
        row=a.length;
        col=a[0].length;
        cache=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                cache[i][j]=-1;
            }
        }
        int longestIncPath=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                longestIncPath=Math.max(longestIncPath,longestIncPath(a,i,j));
            }
        }
        return longestIncPath;
    }
}