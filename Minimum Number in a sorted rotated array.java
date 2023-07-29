//https://practice.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1?
public class Main
{   
     static int minNumber(int arr[],int N)
    {
        // Your code here
        int ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                ans=arr[i];
                break;
            }
        }
        if(ans==0){
            ans=arr[0];
        }
        return ans ;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {3,4,5,1,2};
        System.out.println(minNumber(arr,N));
    }
}
