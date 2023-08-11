// https://practice.geeksforgeeks.org/problems/coin-change2448/1
/*
Input:
N = 3, sum = 4
coins = {1,2,3}
Output: 4
Explanation: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.
*/
class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
         long dp[] = new long [sum+1];
       dp[0] = 1 ;
       
       for(int i = 0 ; i < coins.length ; i++){
           for(int j = coins[i] ;  j < dp.length ; j++){
               dp[j] += dp[j - coins[i]] ;
           }
       }
       return dp[sum];

    }
}
