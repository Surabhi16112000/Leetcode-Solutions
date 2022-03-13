class Solution {
    public String removeDuplicateLetters(String str) 
    {
        Stack<Character> s=new Stack<>();
        int[] freq=new int[26];
        boolean[] present=new boolean[26];
        char[] ch=str.toCharArray();
        for(char c:ch)
        {
            freq[c-'a']++;
        }
        for(int i=0;i<ch.length;i++)
        {
            char c=ch[i];
            freq[c-'a']--;
            if(present[c-'a']==true) continue;
            while(!s.isEmpty() && s.peek()>c && freq[s.peek()-'a']>0)
            {
                char x=s.pop();
                present[x-'a']=false;
            }
            present[c-'a']=true;
            s.push(c);
        }
        String ans="";
        while(!s.isEmpty())
        {
            ans=s.pop()+""+ans;
        }
        return ans;
    }
}