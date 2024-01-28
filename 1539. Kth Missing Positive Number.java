//https://leetcode.com/problems/kth-missing-positive-number/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        //LinkedHashSet<Integer> set = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        ArrayList<Integer> result =new ArrayList<>();
        for(int i=1;i<arr[arr.length-1]+10000;i++){
             if(list.contains(i)==false) {
                 result.add(i);
             }
        }
        return result.get(k-1);
    }
}
