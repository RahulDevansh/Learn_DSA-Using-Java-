//https://practice.geeksforgeeks.org/problems/even-and-odd/1?
import java.util.*;
public class Main
{   
    static void reArrange(int[] arr, int N) {
        // code here
        ArrayList<Integer> odd = new ArrayList<>(N);
        ArrayList<Integer> even = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }
        int l=0;
        int j=0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                arr[i]=even.get(l);
                l++;
            } else {
                arr[i]=odd.get(j);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {3, 6, 12, 1, 5, 8};
        reArrange(arr, N);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
