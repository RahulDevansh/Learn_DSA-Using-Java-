//https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1?page=1
import java.util.*;
public class Main
{   
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
    long [] ans=new long[n];
    int isZero=0;
    int zeroIndex=-1;
    Arrays.fill(ans, 0);
    long total=1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
             total=total*nums[i];
            }
            if(nums[i]==0){
               zeroIndex=i; 
              isZero++;  
            }
        }
        if(isZero>1){
            return ans;
        }
        else if(isZero==1){
            ans[zeroIndex]=total;
            return ans;
        }
        for(int i=0;i<n;i++){
             ans[i]=total/nums[i];
        }
        return ans;
	} 
    public static void main(String[] args) {
        int n = 5;
        int nums[] = {10, 3, 5, 6, 2};
        long result[]=productExceptSelf(nums, n);
        for(long num : result){
            System.out.print(num+" ");
        }
    }
}
