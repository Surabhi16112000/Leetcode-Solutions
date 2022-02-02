class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int[] a=new int[26];
        int[] b=new int[26];
        for(char c : p.toCharArray())
        {
            a[c-'a']++;
        }
        List<Integer> ans=new LinkedList<>();
        int st=0,e=0;
        int c=0;
        int l1=s.length();
        int l2=p.length();
        for(int i=0;i<=l1-l2;i++)
        {
            b=new int[26];
            for(int j=i;j<l2+i;j++)
            {
                b[s.charAt(j)-'a']++;
            }
            if(isEqual(a,b))
            {
                ans.add(i);
            }
            
        }
            
        return ans;
    }
    
    boolean isEqual(int[] a, int[] b)
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
}