class Solution {
    public int maxScoreSightseeingPair(int[] a) 
    {
        int n=a.length;
        int max=0; int left=a[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(max,left+a[i]-i);
            left=Math.max(left,a[i]+i);
        }
        return max;
        
    }
}