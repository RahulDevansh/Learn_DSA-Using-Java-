//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int cheak =arr[1]-arr[0];
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1]-arr[i]!=cheak){
                    return false;
                 }
            }
        
        return true;
    }
}
