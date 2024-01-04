// https://leetcode.com/problems/set-mismatch/description/
class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        Arrays.sort(nums);
        int sum1 =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                ans[0]=nums[i];
            }
            sum1 +=nums[i];
        }
        sum1 = sum1+nums[nums.length-1];
        int sum2 =(nums.length*(nums.length+1))/2;
        ans[1]=sum2 - (sum1-ans[0]);
        return ans;
    }
}
