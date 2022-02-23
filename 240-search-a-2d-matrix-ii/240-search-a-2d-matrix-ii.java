class Solution {
    public boolean searchMatrix(int[][] m, int t) 
    {
        int r=m.length;
        int c=m[0].length;
        
        int p1=0,p2=c-1;
        while(p1<r && p2>=0)
        {
            if(m[p1][p2]==t) return true;
            
            if(t<m[p1][p2])
                p2--;
            else
                p1++;
        }
        return false;
        
    }
}