class Solution {
    public boolean isEqual(int[] str1, int[] str2)
    {
        for(int i=0;i<26;i++)
        {
            if(str1[i]!=str2[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) 
    {
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2) return false;
        int[] str1=new int[26];
        int[] str2=new int[26];
        for(char ch : s1.toCharArray())
        {
            str1[ch-'a']++;
        }
        char[] S2=s2.toCharArray();
        for(int i=0;i<=l2-l1;i++)
        {
            str2=new int[26];
            for(int j=0;j<l1;j++)
            {
                char ch=S2[i+j];
                {
                    str2[ch-'a']++;
                }
            }
            if(isEqual(str1,str2)==true) return true;
        }
        return false;
    }
}