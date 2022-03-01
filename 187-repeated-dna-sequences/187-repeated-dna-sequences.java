class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        List<String> ans=new ArrayList<>();
        int l=s.length();
        HashMap<String,Integer> hs=new HashMap<>();
        int i=0;
        while(i+10<=l)
        {
            String str=s.substring(i,i+10);
            i++;
            int count=hs.getOrDefault(str,0)+1;
            if(count==2)
            {
                ans.add(str);
            }
            hs.put(str,count);
        }
        return ans;
    }
}