class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) 
    {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        sum(a, t, 0, l,res);
        return res;
    }
    public void sum(int[] a, int t, int s, List<Integer> l, List<List<Integer>> res)
    {
        if(t==0)
        {
            res.add(new ArrayList(l));
        }
        if(t<0)
        {
            return;
        }
        for(int i=s;i<a.length;i++)
        {
            l.add(a[i]);
            sum(a,t-a[i],i,l,res);
            l.remove(l.size()-1);
        }
    }
}