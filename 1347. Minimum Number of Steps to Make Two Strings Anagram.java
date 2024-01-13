// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/?envType=daily-question&envId=2024-01-13
class Solution {
    public int minSteps(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int [] arr = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            arr[sArray[i] - 'a']++;
            arr[tArray[i] - 'a']--;
        }

        for (int num : arr) {
            if (num > 0 ) count += num;
        }

        return count;
    }
}
