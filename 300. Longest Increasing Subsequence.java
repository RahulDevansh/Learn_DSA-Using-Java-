// https://leetcode.com/problems/longest-increasing-subsequence/description/?envType=daily-question&envId=2024-01-05
class Solution {
    public int lengthOfLIS(int[] nums) {
        // Only Half of Test Case Passed 
        // int count =1; 
        // for(int i=nums.length-1;i>0;i--) {
        //     if(nums[i] > nums[i-1]) {
        //         count++;
        //     }
        // }
        // return count ;
        int[] dp = new int[nums.length];
        int size  = 0;
        for (int num :
                nums) {
            int i = 0, j = size;
            while (i != j){
                int mid = i + (j-i)/2;
                if (dp[mid] < num){
                    i = mid + 1;
                }
                else {
                    j = mid;
                }
            }
            dp[i] = num;
            if (i == size){
                size++;
            }
        }
        return size;
    }
}
