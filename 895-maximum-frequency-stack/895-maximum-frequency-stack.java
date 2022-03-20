class FreqStack {
    HashMap<Integer,Stack<Integer>> hm;
    int maxFreq=0;
    HashMap<Integer,Integer> freq;
    public FreqStack() {
        hm=new HashMap<Integer,Stack<Integer>>();
        freq=new HashMap<Integer,Integer>();
        
    }
    
    public void push(int x) 
    {
        
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        maxFreq = Math.max(maxFreq, f);
        if (!hm.containsKey(f)) hm.put(f, new Stack<Integer>());
        hm.get(f).add(x);
    
        
    }
    
    public int pop() 
    {
        Stack<Integer> currList=hm.get(maxFreq);
        int ans=currList.pop();
        freq.put(ans,freq.get(ans)-1);
        if(currList.isEmpty()==true)
        {
            maxFreq--;
        }
        return ans;
        
    }
}
