class Solution {
    public int ladderLength(String bw, String ew, List<String> wl) 
    {
        HashSet<String> hs= new HashSet<>();
        int l=wl.size();
        for(int i=0;i<l;i++)
        {
            hs.add(wl.get(i));
        }
        if(!hs.contains(ew))
        {
            return 0;
        }
        Queue<String> q=new LinkedList<>();
        
        q.add(bw);
        int depth=0;
        int lSize=0;
        while(!q.isEmpty())
        {
            lSize=q.size();
            depth++;
            while(lSize-->0)
            {
                String x=q.remove();
                 for(int i=0;i<x.length();i++)
                {
                     String temp=x;
                     for(char c='a';c<='z';c++)
                     {
                         temp=x.substring(0,i)+c+x.substring(i+1);
                         if(temp.equals(x))
                         {
                             continue;
                         }
                         if(temp.equals(ew))
                         {
                             return depth+1;
                         }
                         if(hs.contains(temp))
                         {
                             q.add(temp);
                             hs.remove(temp);
                         }
                     }
                }
            }
        }
        return 0;
    }
}