class Solution {
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        //List<Integer> temp=new ArrayList<>();
        solve(1,n,k,new ArrayList<Integer>(),ans);
        return ans;
    }
    public void solve(int curr,int last, int size,List<Integer> temp, List<List<Integer>> ans)
    {
        if(size==0) 
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=curr;i<=last;i++) 
        {
            temp.add(i);
            solve(i+1,last,size-1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
	// public static List<List<Integer>> combine(int n, int k) {
	// 	List<List<Integer>> combs = new ArrayList<List<Integer>>();
	// 	combine(combs, new ArrayList<Integer>(), 1, n, k);
	// 	return combs;
	// }
	// public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
	// 	if(k==0) {
	// 		combs.add(new ArrayList<Integer>(comb));
	// 		return;
	// 	}
	// 	for(int i=start;i<=n;i++) {
	// 		comb.add(i);
	// 		combine(combs, comb, i+1, n, k-1);
	// 		comb.remove(comb.size()-1);
	// 	}
	// }
