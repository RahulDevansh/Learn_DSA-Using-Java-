
//https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?
import java.util.*;
public class Main
{   
    static void segregate0and1(int[] arr, int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {0, 0, 1, 1, 0};
        segregate0and1(arr, N);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
