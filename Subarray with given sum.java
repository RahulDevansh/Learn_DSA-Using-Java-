//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?
/*
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.
*/
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        /* N*N Time Complexity 
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum==s){
                break;
            }
            sum=0;
            int j=i;
            while(j<n){
                sum+=arr[j];
                if(sum==s){
                    ans.add(i+1);
                    ans.add(j+1);
                    break;
                }
                j++;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            return ans ;
        } else {
            return ans;
        }
        */
        
        ArrayList<Integer> a= new ArrayList<>();
        int sum=0;
        int k=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
            if(sum>=s){
                while(k<i && sum>s){
                    sum-= arr[k++];
                }
                if(sum==s){
                   a.add(k+1);
                   a.add(i+1); 
                   break;
                }
            }
        }
        if(a.isEmpty()){
            a.add(-1);
        }
        return a;
    }
}
