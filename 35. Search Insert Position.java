//https://leetcode.com/problems/search-insert-position/description/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) { 
            list.add(nums[i]);
        }
        list.add(target);
        Collections.sort(list);
        for(int i=0;i<list.size();i++) {
            if(target==list.get(i)){
                index=i;
                break;
            }
        }
        return index;
    }
}
