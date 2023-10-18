//https://leetcode.com/problems/parallel-courses-iii/description/
class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        Stack<int[]> s=new Stack<>(); // 0: prev max time, 1: node name
        List<Integer> adj[]=new List[n+1];
        int indegree[]=new int[n+1];
        int maxtime[]=new int[n+1];
        int res=0;
        Arrays.fill(adj, new ArrayList<Integer>());
        for(int[] r: relations) {
            indegree[r[1]]++;
            if(adj[r[0]].size()==0) adj[r[0]]=new ArrayList<Integer>();
            adj[r[0]].add(r[1]);
        }

        for(int i=1;i<=n;i++) 
            if(indegree[i]==0) 
                s.add(new int[]{0, i});

        while(!s.isEmpty()) {
            int curr[]=s.pop(), t=curr[0]+time[curr[1]-1];
            res=Math.max(t, res);
            for(int course: adj[curr[1]]) {
                maxtime[course]=Math.max(maxtime[course], t);
                if(--indegree[course] == 0) {
                    s.push(new int[]{maxtime[course], course});
                }
            }
        }
        return res;
    }
}
