class Solution {
    public int twoCitySchedCost(int[][] a) 
    {
        int n=a.length;
        int[] refund=new int[n];
        int total=0;
        for(int i = 0; i < n; i++)
        {
            total+=a[i][0];
            refund[i]=-a[i][0]+a[i][1];
        }
        Arrays.sort(refund);
        for(int i=0;i<n/2;i++)
        {
            total+=refund[i];
        }
        return total;
    }
}