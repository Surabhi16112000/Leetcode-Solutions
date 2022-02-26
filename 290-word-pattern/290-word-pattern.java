class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String[] str=s.split(" ");
        int n=str.length;
        if(n!=pattern.length()) return false;
        HashMap<Character,String> hm=new HashMap<>();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(hm.containsKey(c))
            {
                if(!hm.get(c).equals(str[i])) return false;
            }
            else if(hs.contains(str[i])) return false;
            else
            {
                hm.put(c,str[i]);
                hs.add(str[i]);
            }
        }
        return true;
    }
}