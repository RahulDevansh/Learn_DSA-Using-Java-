//https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
/*
Input: 
n = 2
Output: 
1 
Explanation: 
1 is the 2nd number of fibonacci series.
*/
class Solution {
    static int nthFibonacci(int n){
        // code here
         if (n<=1)
        {
            return n; 
        }
        int[] fibArr = new int[n + 1];
        
        fibArr[0] = 0;
        fibArr[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fibArr[i] = (fibArr[i - 1] + fibArr[i - 2]) % 1000000007;
        }
        
        return fibArr[n];
          
    }
    
}
