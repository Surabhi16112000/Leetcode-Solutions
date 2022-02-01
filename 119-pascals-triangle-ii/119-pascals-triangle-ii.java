class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        int num=rowIndex+1;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(num>=1)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            ans.add(temp);
            if(num==1)return ans.get(0);
        }
        if(num>=2){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            temp.add(1); 
            ans.add(temp);
            if(num==2)return ans.get(1);
        }
        for(int i=3;i<=num;i++)
        {
            List<Integer> temp=ans.get(i-2);
            ArrayList<Integer> sol=new ArrayList<>();
            sol.add(1);
            for(int j=0;j<i-2;j++)
            {
                int x=temp.get(j); int y=temp.get(j+1);
                sol.add(x+y);
            }
            sol.add(1);
            ans.add(sol);
        }
        return ans.get(num-1);
        
    }
}