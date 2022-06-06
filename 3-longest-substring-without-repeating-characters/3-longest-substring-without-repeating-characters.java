class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int[] prev=new int[256];
        Arrays.fill(prev,-1);
        int i=0;
        int res=0;
        for(int j=0;j<s.length();j++)
        {
            i=Math.max(i,prev[s.charAt(j)]+1);
            res=Math.max(res,j-i+1);
            prev[s.charAt(j)]=j;
        }
        return res;
    }
}