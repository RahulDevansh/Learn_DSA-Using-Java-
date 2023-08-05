//https://practice.geeksforgeeks.org/problems/101-pattern-count1341/1?
class Solution 
{ 
    int patternCount(String S) 
    { 
        // code here
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.charAt(i) == '1' && S.charAt(i + 1) == '0') {
                int j = i + 2;
                while (j < S.length() && S.charAt(j) == '0') {
                    j++;
                }
                if (j < S.length() && S.charAt(j) == '1') {
                    count++;
                    i = j - 1;
                }
            }
        }
        return count;
    }
} 
