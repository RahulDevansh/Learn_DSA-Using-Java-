//https://www.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        if(nums.length%2==1) return false;
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            int mod = i%k;
            if(mod==0){if(!set.add(0)) set.remove(0);}
            else if(set.contains(k-mod)) set.remove(k-mod);
            else set.add(mod);
        }
        return set.isEmpty();
    }
}
