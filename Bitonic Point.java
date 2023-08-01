
//https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1?
import java.util.*;
public class Main
{   
    static int findMaximum(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        int N = 4;
        int A[] = {4, 2, 5, 7};
        System.out.println(findMaximum(A, N));
    }
}
