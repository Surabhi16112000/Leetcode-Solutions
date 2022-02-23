/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) 
    {
        HashMap<Node,Node> hm=new HashMap<>();
        if(node==null) return null;
        hm.put(node, new Node(node.val));
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            for(Node n: temp.neighbors)
            {
                if(!hm.containsKey(n))
                {
                    hm.put(n,new Node(n.val));
                    q.add(n);
                }
                hm.get(temp).neighbors.add(hm.get(n));
            }
        }
        return hm.get(node);
    }
}