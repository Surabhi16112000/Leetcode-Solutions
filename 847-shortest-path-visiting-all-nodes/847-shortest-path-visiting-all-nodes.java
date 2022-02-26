class Solution {
    public int shortestPathLength(int[][] g) 
    {
        int n=g.length;
        if(n==1) return 0;
        Queue<int[]> q=new LinkedList<>();
        int states=(1<<n)-1;
        boolean[][] dp=new boolean[n][states+1];
        
        for(int i=0;i<n;i++)
        {
            q.add(new int[]{i,(1<<i)});
        }
        int shortestPath=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            shortestPath++;
            for(int i=0;i<s;i++) 
            {
                int[] top=q.remove();
                int nodeId=top[0];
                int nodeState=top[1];
                for(int neighbor:g[nodeId])
                {
                    int currState=nodeState | (1<<neighbor);
                    //System.out.println(currState);
                    if(dp[neighbor][currState]==true) continue;
                    else
                    {
                        dp[neighbor][currState]=true;
                        if(currState==states) return shortestPath;
                        q.add(new int[]{neighbor,currState});
                    }
                    
                }
            }
            
        }
        return -1;
    }
}