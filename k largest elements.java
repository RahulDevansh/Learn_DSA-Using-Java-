//https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1?
import java.util.*;
public class Main
{   
    static int[] kLargest(int[] arr, int n, int k) {
        // code here
        int ans[] = new int[k];
        Arrays.sort(arr);
        int index=0;
        for(int i=n-1;i>n-1-k;i--){
            ans[index]=arr[i];
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 7, K = 3;
        int Arr[] = {1, 23, 12, 9, 30, 2, 50};
        System.out.println(Arrays.toString(kLargest(Arr, N, K)));
    }
}
