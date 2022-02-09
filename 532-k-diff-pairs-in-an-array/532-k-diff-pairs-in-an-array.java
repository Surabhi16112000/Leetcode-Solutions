class Solution {
    class Pair{
        int a,b;
        Pair(int x, int y)
        {
            a=x; 
            b=y;
        }
    }
    public int findPairs(int[] nums, int k) 
    {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                if(k==0 && hm.get(i)==1)
                {
                    ans++;
                }
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                if(hm.containsKey(i-k))
                {
                    ans++;
                }
                if(hm.containsKey(i+k))
                {
                    ans++;
                }
                hm.put(i,1);
            }
        }
       
        
        return ans;
    }
}