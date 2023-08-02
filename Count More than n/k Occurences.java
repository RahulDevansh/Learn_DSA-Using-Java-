
//https://practice.geeksforgeeks.org/problems/count-element-occurences/1?
import java.util.*;
public class Main
{   
    public static int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set =map.keySet();
        int count=0;
        for(int num: set){
            if(map.get(num)> n/k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int N = 8;
        int arr[] = {3,1,2,2,1,2,3,3};
        int k = 4;
        System.out.println(countOccurence(arr, N, k));
    }
}
