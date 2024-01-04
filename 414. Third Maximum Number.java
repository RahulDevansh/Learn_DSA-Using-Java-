// https://leetcode.com/problems/third-maximum-number/description/ 
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int arr[] = new int[set.size()];
        int i=0;
        for(int ar:set) {
            arr[i]=ar;
            i++;
        }
        Arrays.sort(arr);
        if(arr.length <3) {
            return arr[arr.length-1];
        }
        return arr[arr.length-3];
    }
}
