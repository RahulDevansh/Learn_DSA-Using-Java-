//https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?
import java.util.*;
public class Main
{   
    static int remove_duplicate(int A[],int N){
        LinkedHashMap<Integer,Integer> map =new LinkedHashMap<>();
        for(int i=0;i<N;i++){
                map.put(A[i],1);
        }
        Set<Integer> set=map.keySet();
        int i=0;
        for(int num : set){
            if(map.get(num)==1){
                A[i]=num;
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 2, 4};
        int N=arr.length;
        System.out.println(remove_duplicate(arr,N));
        for(int i=0;i<remove_duplicate(arr,N);i++) {
            System.out.print(arr[i]+" ,");
        }
    }
}
