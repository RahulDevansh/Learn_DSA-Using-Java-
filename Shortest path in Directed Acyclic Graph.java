//https://practice.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		List<List<Integer[]>> list=new ArrayList<>();
		for(int i=0;i<N;i++)    list.add(new ArrayList<>());
		for(int e[]:edges)   list.get(e[0]).add(new Integer[]{e[1],e[2]});
		int ans[]=new int[N];
		Arrays.fill(ans,-1);
		Queue<Integer[]> q = new LinkedList<>();
		q.add(new Integer[]{0,0});
		
		while(!q.isEmpty()){

		    Integer pop[] = q.remove();
		    if(ans[pop[0]]==-1) ans[pop[0]] = pop[1];
		    else if(ans[pop[0]]<=pop[1]) continue;
		    else    ans[pop[0]] = pop[1];
		    
		    for(Integer[] nbr:list.get(pop[0])) q.add(new Integer[]{nbr[0],nbr[1]+pop[1]});
		    
		}
		
		return ans;
	}
}
