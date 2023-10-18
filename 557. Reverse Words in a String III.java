//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
class Solution {
    public String reverseWords(String s) {
        String arr[] =s.split(" ");
        String ans ="";
        for(int i=0;i<arr.length;i++) {
            
        StringBuilder input1 = new StringBuilder();
        input1.append(arr[i]);
        input1.reverse();
        ans+=input1+" ";
        }
        ans=ans.stripTrailing();
        return ans ;
    }
}
