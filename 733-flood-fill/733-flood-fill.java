class Solution {
    
    
    int[] dir={0,1,0,-1,0};
    int row, col;
    
    
    public int[][] floodFill(int[][] a, int sr, int sc, int ncol) 
    {
        if(a[sr][sc]==ncol) return a;
        row=a.length; 
        col=a[0].length;
        int old=a[sr][sc];
        a[sr][sc]=ncol;
        for(int i=0;i<4;i++)
        {
            int nr=sr+dir[i];
            int nc=sc+dir[i+1];
            if(nr<0 || nr>=row || nc<0 || nc>=col || a[nr][nc]!=old) continue;
            floodFill(a,nr, nc, ncol);
        }
        //dfs(a,sr,sc,a[sr][sc],nc);
        return a;
        
    }
}