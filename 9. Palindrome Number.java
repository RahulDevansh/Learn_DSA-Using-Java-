//https://leetcode.com/problems/palindrome-number/description/
class Solution {
    public boolean isPalindrome(int x) { 
        if(x<0) {
            return false ;
        }
        String s = ""+x;
        String news="";
        for(int i=s.length()-1;i>=0;i--) {
            news =news+s.charAt(i);
        }
        if(news.equals(s)) {
            return true;
        } else {
            return false ;
        }
        
    }
}
