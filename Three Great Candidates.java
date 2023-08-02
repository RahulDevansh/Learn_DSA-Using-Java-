
//https://practice.geeksforgeeks.org/problems/three-great-candidates0515/1?
import java.util.*;
public class Main
{   
    static long maxProduct(int[] arr, int n) {
        if(n >= 3) {
            Arrays.sort(arr);
            return (long) Math.max( (long) arr[0] * arr[1] * arr[n-1], (long) arr[n-1] * arr[n-2] * arr[n-3]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = {-10, -3, -5, -6, -20};
        System.out.println(maxProduct(Arr, N));
    }
}
