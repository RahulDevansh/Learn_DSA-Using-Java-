//https://practice.geeksforgeeks.org/problems/single-number1014/1?page=7
import java.util.*;
public class Main
{   
    static int getSingle(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        } 
        int ans =0;
        Set<Integer> set =map.keySet();
        for(int num:set){
            if(map.get(num)%2!=0) {
                ans=num;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = {1, 1, 2, 2, 2};
        System.out.println(getSingle(Arr[],N));
    }
}
