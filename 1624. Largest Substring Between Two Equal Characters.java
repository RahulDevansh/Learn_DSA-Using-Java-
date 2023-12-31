//1624. Largest Substring Between Two Equal Characters
 
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int largest =-1;
        for(int i=0; i<s.length(); i++) {
            for(int j=s.length()-1; j>=0; j--) {
                if(s.charAt(i)==s.charAt(j)){
                    largest = Math.max(largest,j-i-1);
                }
            }
        }
        return largest ;
    }
}
