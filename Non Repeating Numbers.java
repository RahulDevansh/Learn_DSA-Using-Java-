//https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1
/*
Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
*/
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        int arr[] = new int[2];
        int i=0;
        
        for(int num: map.keySet()) {
            if(map.get(num)==1){
                arr[i]=num;
                i++;
            }
            if(i==3){
                break;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
