//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i=0;i<list.size();i++) {
            nums[i] =list.get(i);
        }
        return list.size();
        
    }
}
