//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=daily-question&envId=2024-01-03
class Solution {
  public int numberOfBeams(String[] bank) {
    var onesA = 0;
    var cnt = 0;

    for (var row : bank) {
      var onesB = 0;

      for (var c : row.toCharArray())
        if (c == '1') onesB++;
      
      if (onesB == 0) continue;

      cnt += onesA * onesB;
      onesA = onesB;
    }
    return cnt;
  }
}
