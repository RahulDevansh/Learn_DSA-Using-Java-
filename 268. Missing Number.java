// https://leetcode.com/problems/missing-number/description/
class Solution {
    public int missingNumber(int[] nums) {
        int num = nums.length;
        int numsum = (num*(num+1))/2 ;
        int arraysum =0;
        for(int i=0;i<nums.length;i++) {
            arraysum +=nums[i];
        }
        return (numsum-arraysum) ; 
    }
}
