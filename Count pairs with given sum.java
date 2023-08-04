
//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?
import java.util.*;
public class Main
{   
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        /*
        Time Complexity 
        int counter =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    counter++;
                }
            }
        }
        return counter; */
        Map<Integer, Integer> occurance = new HashMap<Integer, Integer>();
        int numberOfPairs = 0;
        for(int i: arr) {
            int target = k - i;
            if(occurance.containsKey(target)) {
                numberOfPairs += occurance.get(target);
            }
            occurance.put(i, occurance.getOrDefault(i, 0) + 1);
        }
        return numberOfPairs;
    }
    public static void main(String[] args) {
        int N = 4, K = 6;
        int arr[] = {1, 5, 7, 1};
        System.out.println(getPairsCount(arr, N, K));
    }
}
