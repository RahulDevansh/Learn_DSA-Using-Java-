//https://practice.geeksforgeeks.org/problems/frequency-of-each-element-in-an-unsorted-array0759/1?
import java.util.*;
public class Main
{   
    public static ArrayList<Integer> countFreq(int[] a, int n)  
    { 
        // complete the function
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
        Set<Integer> set= map.keySet();
        int sum=0;
        for(int num: set){
            sum=sum+map.get(num);
            list.add(sum);
        }
        return list ;
    }  
    public static void main(String[] args) {
        int Arr[] = {1, 2, 2, 1, 3, 4};
        int n=Arr.length;
        ArrayList<Integer> list=countFreq(Arr, n);
        for(int num : list){
            System.out.print(num+" ");
        }
    }
}
