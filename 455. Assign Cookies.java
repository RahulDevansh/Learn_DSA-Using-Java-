//https://leetcode.com/problems/assign-cookies/description/?envType=daily-question&envId=2024-01-01
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j=0;
        while (i < g.length && j < s.length){
            if (g[i] <= s[j]){
                count += 1;
                i += 1;
            }
            j += 1;
        }
        return count;

    }
}
