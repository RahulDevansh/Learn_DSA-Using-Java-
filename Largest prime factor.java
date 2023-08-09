//https://practice.geeksforgeeks.org/problems/largest-prime-factor2601/1
// Code working Fine with TLA
/*
N = 5
Output:5
*/
class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        int count=0;
        for(long i=2;i<=N;i++){
            if(N%i==0){
                for(long j=2;j<i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==0){
                    ans.add(i);
                }
            }
            count=0;
        }
        Collections.sort(ans);
        return ans.get(ans.size()-1);
    }
}
