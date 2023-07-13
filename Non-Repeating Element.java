//https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1?page
import java.util.*;
public class Main
{   
    public static int firstNonRepeating(int arr[], int n) 
    { 
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = map.keySet();
        int ans =0;
        for(int num : set){
            if(map.get(num)==1) {
                ans=num;
                break;
            }
        }
        return ans;
    }  
    public static void main(String[] args) {
        int arr[] = {-1, 2, -1, 3, 2};
        int n=5;
        System.out.println(firstNonRepeating(arr,n));
    }
}
