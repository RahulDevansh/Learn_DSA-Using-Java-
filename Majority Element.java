//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?
import java.util.*;
public class Main
{   
    static int majorityElement(int a[], int size)
    {
        if(size==2) {
            int ans =-1;
            if(a[0]==a[1]) {
                ans =a[0];
            }
            return -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++) {
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            } else {
                map.put(a[i],1);
            }
        }
        Set<Integer> set =map.keySet();
        int ans=-1;
        int N=size/2;
        for(int num :set){
            if(map.get(num) > N) {
                ans =num ;
                break ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int N = 5 ;
        int A[] = {3,1,3,3,2} ;
        System.out.println(majorityElement(A,N));
    }
}
