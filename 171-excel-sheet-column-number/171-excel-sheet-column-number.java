class Solution {
    //ct=columnTitle
    public int titleToNumber(String ct) 
    {
        if(ct==null) return -1;
        int ans=0;
        for(char c: ct.toCharArray())
        {
            ans=ans*26;
            ans=ans+c-'A'+1;
        }
        return ans;
    }
}