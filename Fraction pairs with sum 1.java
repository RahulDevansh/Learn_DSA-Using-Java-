//https://practice.geeksforgeeks.org/problems/fraction-pairs-with-sum-1/1
/*
N = 4
numerator = [1, 2, 2, 8]
denominator = [2, 4, 6, 12]
*/

class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        int count = 0;
        HashMap<Double,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            double t1 = (double)numerator[i]/denominator[i];
            double t2 = (double)(denominator[i] - numerator[i])/denominator[i];
            if(hmap.containsKey(t2))
            {
                count += hmap.get(t2);
            }
            hmap.put(t1,hmap.getOrDefault(t1,0)+1);
        }
        return count;
    }
}
