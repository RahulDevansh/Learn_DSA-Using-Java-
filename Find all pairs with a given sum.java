//https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?
class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        /*
        Input:
        A[] = {-1, -2, 4, -6, 5, 7}
        B[] = {6, 3, 4, 0} 
        X = 8 
        */
        ArrayList<pair> list = new ArrayList<>();
        Arrays.sort(A);
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i]+B[j]==X){
                    list.add(new pair(A[i],B[j]));
                }
            }
        }
        pair[] pair = new pair[list.size()];
        return list.toArray(pair);
    }
}
