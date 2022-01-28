class Solution {
    public int maxProfit(int[] prices, int fee) 
    {
        int n=prices.length;
        if(n==1) return 0;
        int oldbuy=-prices[0];
        int oldsell=0;
        for(int i=1;i<n;i++)
        {
            int newbuy=0, newsell=0;
            if(oldsell-prices[i] > oldbuy)
            {
                newbuy=oldsell-prices[i];
            }
            else
            {
                newbuy=oldbuy;
            }
            
            if(oldbuy+prices[i]-fee>oldsell)
            {
                newsell=oldbuy+prices[i]-fee;
            }
            else
            {
                newsell=oldsell;
            }
            oldbuy=newbuy;
            oldsell=newsell;
        }
        return oldsell;
        
    }
}