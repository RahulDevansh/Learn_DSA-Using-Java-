//https://practice.geeksforgeeks.org/problems/closest-strings0611/1?
/*
    Input:
    S = { "the", "quick", "brown", "fox", "quick"}
    word1 = "the"
    word2 = "fox"
    Output: 3
*/
class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int a = -1 , b = -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){
            if(s.get(i).equals(word1))
            a = i;
            if(s.get(i).equals(word2))
            b = i;
            if(a != -1 && b != -1)
            ans = Math.min(ans,Math.abs(b-a));
        }
        return ans;
    }
} 

