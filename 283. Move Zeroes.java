// https://leetcode.com/problems/move-zeroes/description/ 
class Solution {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        int m =0;
        int n =nums.length-1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                arr[m]=nums[i];
                m++;
            }
            if(nums[i]==0) {
                arr[n]=nums[i];
                n--;
            }
        }
        for(int i=0;i<nums.length;i++) {
            nums[i]=arr[i];
        }
    
    }
}
