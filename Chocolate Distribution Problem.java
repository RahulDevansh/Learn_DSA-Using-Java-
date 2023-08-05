//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-m; i++)
        {
           if(min>(a.get(m+i-1)-a.get(i)))
           {
           min=(a.get(m+i-1)-a.get(i));
           }
        
        }
        return min;
    }
}
