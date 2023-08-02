
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1?
import java.util.*;
public class Main
{   
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
    } 
    public static void main(String[] args) {
        int N = 5;
        int arr[] ={ 7, 10, 4, 20, 15};
        int k = 4;
        int l=0;
        int r=N;
        System.out.println(kthSmallest(arr, l, r, k) );
    }
}
