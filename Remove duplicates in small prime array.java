//https://practice.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1?
import java.util.*;
public class Solution
{   
    static ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
       int N = 6;
       int A[] = {2,2,3,3,7,5};
       System.out.println(removeDuplicate(A,N));
    }
}
