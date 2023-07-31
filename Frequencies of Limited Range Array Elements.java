//https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?
import java.util.*;
public class Main
{   
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=1;i<=N;i++){
            map.put(i,0);
        }
        for(int i=0;i<N;i++){
            if(arr[i]<=N){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
            }
        }
        Set<Integer> set =map.keySet();
        int m=0;
        for(int num : set){
            arr[m]=map.get(num);
            m++;
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {2, 3, 2, 3, 5};
        int P = 5;
        frequencyCount(arr, N, P);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
