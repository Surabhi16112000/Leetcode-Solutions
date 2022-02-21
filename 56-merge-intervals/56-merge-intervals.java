class Solution {
    
    public int[][] merge(int[][] A) 
    {
        int n=A.length;
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        Arrays.sort(A,(a1,a2)-> Integer.compare(a1[0],a2[0]));
        
        for(int i=0;i<n;i++)
        {
            int size=al.size();
            if(size==0 || al.get(size-1).get(1)<A[i][0])
            {
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(A[i][0]); temp.add(A[i][1]);
                al.add(temp);
            }
            else if(al.get(size-1).get(1)>=A[i][0])
            {
                int max=Math.max(A[i][1],al.get(size-1).get(1));
                
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(al.get(size-1).get(0));
                al.remove(size-1);
                temp.add(max);
                al.add(temp);
            }
        }
        int[][] ans=new int[al.size()][2];
        for(int i=0;i<al.size();i++)
        {
            ans[i][0]=al.get(i).get(0);
            ans[i][1]=al.get(i).get(1);
        }
        return ans;
        
    }
}