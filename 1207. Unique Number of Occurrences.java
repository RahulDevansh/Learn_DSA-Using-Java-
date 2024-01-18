// https://leetcode.com/problems/unique-number-of-occurrences/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int a: map.keySet()) {
            list.add(map.get(a));
        }
        Collections.sort(list);
        boolean result = true ;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i)==list.get(i+1)) {
                result = false ;
                break ;
            }
        }
        return result ;
    }
}
