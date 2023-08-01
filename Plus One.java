//https://practice.geeksforgeeks.org/problems/plus-one/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Arrays&sortBy=submissions
class Solution {
    boolean check(int N, int M, int[][] A,boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>=N || j>=M || A[i][j]==0 || visited[i][j])
            return false;
        visited[i][j]=true;
        return true;
    }
    class Pair{
    int i;
    int j;
         Pair(int i, int j ){
            this.i = i;
            this.j = j;
     }
    }
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        int count=0;
        Queue<Pair> queue = new LinkedList<Pair>();
        boolean[][] visited = new boolean[N][M];
        queue.add(new Pair(0,0));
        while(!queue.isEmpty()){
            int size = queue.size();
         
            while(size-->0){
                Pair p = queue.poll();
                if(p.i==X && p.j==Y)
                    return count;
                visited[p.i][p.j]=true;
                if(check(N,M,A,visited,p.i+1,p.j))
                    queue.add(new Pair(p.i+1,p.j));
                
                if(check(N,M,A,visited,p.i,p.j+1))
                    queue.add(new Pair(p.i,p.j+1));
                    
                if(check(N,M,A,visited,p.i-1,p.j))
                    queue.add(new Pair(p.i-1,p.j));
                    
                if(check(N,M,A,visited,p.i,p.j-1))
                    queue.add(new Pair(p.i,p.j-1));
            }
                count++;
        }
        return -1;
    }
}
