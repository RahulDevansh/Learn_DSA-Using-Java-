//https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1
/*
Input:
N = 16
A = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15}
Output: 
6
Explanation:
There are more than one LIS in this array. One such Longest increasing subsequence is {0,2,6,9,13,15}.
*/

class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int binarySearch(ArrayList<Integer> list, int a, int left, int right) {
        while( right > left) {
            int mid = (left + right)/2;
            
            if(list.get(mid) >= a) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return right;
    } 
    static int longestSubsequence(int size, int a[])
    {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        
        for(int i=1; i<size; i++) {
            int n = list.size();
            if(a[i] > list.get(n-1)) list.add(a[i]);
            else {
                int index = binarySearch(list, a[i], 0, n-1);
                list.set(index, a[i]);
            }
        }
        return list.size();
        
    }
} 
