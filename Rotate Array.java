
//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?
import java.util.*;
public class Main
{   
    static void reverse (int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        // if(d>=n){
        //     return ;
        // }
        // int new_arr[] =new int[n];
        // for(int i=0;i<n;i++){
        //     new_arr[i]=arr[i];
        // }
        // int k=0;
        // for(int i=d;i<n;i++){
        //     arr[k]=new_arr[i];
        //     k++;
        // }
        // for(int i=0;i<d;i++){
        //     arr[k]=new_arr[i];
        //     k++;
        // }
        
           d %= n;
        reverse(arr, 0, d - 1); // reverse the first d elements
        reverse(arr, d, n - 1); // reverse the rest of the array
        reverse(arr, 0, n - 1); // reverse the entire array 
        
    }
    public static void main(String[] args) {
        int N = 10, D = 3;
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        rotateArr(arr, D, N);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
