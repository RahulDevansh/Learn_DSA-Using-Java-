// https://www.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/1
class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        for(int key : map.keySet()) {
            if(map.get(key)==1) 
                return key;
        }
        return -1;
    }
}
