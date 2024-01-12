//https://leetcode.com/problems/determine-if-string-halves-are-alike/
class Solution {
	   public boolean halvesAreAlike(String s) {
			return numberOfVowels(s.substring(0,s.length()/2)) == numberOfVowels(s.substring(s.length()/2));
	   }

		public int numberOfVowels(String str) {
			int num = 0;
			for (char c : str.toCharArray()) {
				if (c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101 || c == 105 || c == 111 || c == 117)
					num++;
			}
			return num;
		}
}
