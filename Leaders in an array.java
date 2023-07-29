//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?
import java.util.*;
public class Main
{   
     static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int max=-1;
        for(int i=n-1;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int n = 6;
        int A[] = {16,17,4,3,5,2};
        System.out.println(leaders(A,n));
    }
}
