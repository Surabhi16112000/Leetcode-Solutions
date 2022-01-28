class Solution {
    public int maxProfit(int[] a) 
    {
        int n=a.length; 
        if(n==1) return 0;
        int[] inHand=new int[n];
        int[] sold=new int[n];
        int[] noStock=new int[n];
        
        inHand[0]=-a[0];
        sold[0]=0;
        noStock[0]=0;
        
        for(int i=1;i<n;i++)
        {
            noStock[i]=Math.max(noStock[i-1],sold[i-1]);
            inHand[i]=Math.max(inHand[i-1],noStock[i-1]-a[i]);
            sold[i]=inHand[i-1]+a[i];
        }
        return Math.max(sold[n-1],noStock[n-1]);
    }
}