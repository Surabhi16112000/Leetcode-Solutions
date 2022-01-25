class Solution {
    public boolean canJump(int[] A) 
    {
        int n=A.length;
        int last=n-1,i,j;
        for(i=n-2;i>=0;i--)
        {
            if(i+A[i]>=last)last=i;
        }
        return last<=0;
        
    }
}