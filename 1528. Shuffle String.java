//https://leetcode.com/problems/shuffle-string/
class Solution {
    public String restoreString(String s, int[] indices) {
       // ArrayList<Character> list = new ArrayList<>();
        char result[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            result[indices[i]]=s.charAt(i);
        }
        String S ="";
        for(char c: result){
            S =S+c;
        }
        return S;
    }
}
