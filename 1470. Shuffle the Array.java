//https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {

        ArrayList<Integer> list = new ArrayList<>();
        int m=n;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
            list.add(nums[m]);
            m++; 
        }
        int i=0;
        for(int arr: list){
            nums[i]=arr;
            i++;
        }
        return nums ;
    }
}
