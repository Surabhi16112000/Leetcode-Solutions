class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        int[] charCount=new int[26];
        Arrays.fill(charCount,0);
        int l=s.length();
        int max=0,st=0;
        int i=0;
        List<Integer> ans=new ArrayList<>();
        while(i<l)
        {
            if(i==max+1)
            {
                ans.add(max-st+1);
                st=i;
            }
            char c=s.charAt(i);
            if(charCount[c-'a']==0)
            {
                int ind=s.lastIndexOf(c);
                if(ind>max)
                {
                    max=ind;
                }
            }
            i++;
        }
        ans.add(max-st+1);
        return ans;
    }
}