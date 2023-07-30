//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.offer(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!vis[curr]){
                arr.add(curr);
                vis[curr] = true;
                for(int i=0;i<adj.get(curr).size();i++){
                    if(!vis[adj.get(curr).get(i)]){
                        q.offer(adj.get(curr).get(i));
                    }
                }
            }
        }
        return arr;
    }
}
