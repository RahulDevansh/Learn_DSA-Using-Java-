// https://leetcode.com/problems/house-robber/
class Solution {
    public int rob(int[] nums) {
       //  int sum1 =0;
       //  int sum2 =0;
       //  for(int i=0;i<nums.length;i++) {
       //      if((i+1)%2 !=0){
       //          sum1 +=nums[i];
       //      }
       //      else if((i+1)%2 ==0){
       //          sum2 +=nums[i];
       //      }
       //  }
       // return (sum1>sum2) ? sum1 : sum2; 
        int sum1 = 0;
        int sum2 = 0;
        for(int num: nums) {

            int curRob = sum2 + num;
            int curNoRob = Math.max(sum2, sum1);

            sum1 = curRob;
            sum2 = curNoRob;

        }

        return Math.max(sum1, sum2);
    }
}
