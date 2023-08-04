
//https://practice.geeksforgeeks.org/problems/rotation4723/1?
import java.util.*;
public class Main
{   
    static int findKRotation(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        int counter=0;
        for(int i=0;i<n;i++) {
            if(arr[i]>arr[n-1]){
                list.add(arr[i]);
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = {5, 1, 2, 3, 4};
        System.out.println(findKRotation( Arr, N));
    }
}
