//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?
import java.util.*;
public class Main
{   
        public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        long sum=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        long curSum=0;
        for(int i=0;i<n;i++){
            curSum+=arr[i];
            long leftSum=curSum-arr[i];
            long rightSum=sum-curSum;
            if(leftSum==rightSum){
                ans=i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5; 
        long A[] = {1,3,5,2,2};
        System.out.println(equilibriumPoint(A,n));
    }
}
