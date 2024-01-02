//https://leetcode.com/problems/single-number/description/
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) {
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
            }  else {
                map.put(nums[i],1);
            }
        }
        int ans =0;
        for(Integer set : map.keySet()) {
            if(map.get(set)==1) {
                ans = set;
            }
        }
        return ans ;
    }
}
