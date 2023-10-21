//https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
class Solution{
    static long sumOfDivisors(int N){
  
        long ans=0;
        for(int i=1;i<=N;i++){
            
            ans+= i*(N/i);
        }
        
        return ans;
    }
}
