class MyHashMap {
    int[] a;
    public MyHashMap() {
        a=new int[10000001];
        Arrays.fill(a,-1);
    }
    
    public void put(int key, int value) {
        a[key]=value;
        return;
    }
    
    public int get(int key) {
        return a[key];
    }
    
    public void remove(int key) {
        a[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */