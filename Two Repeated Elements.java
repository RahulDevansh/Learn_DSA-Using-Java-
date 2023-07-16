//https://practice.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1?
import java.util.*;
public class Main
{   
    public static int[] twoRepeated(int arr[], int N)
    {
        int index=0;
        int arr1[] =new int[2];
        LinkedHashMap<Integer,Integer> map =  new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                arr1[index]=arr[i];
                index++;
            } else {
                map.put(arr[i],1);
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int N = 4;
        int array[] = {1,2,1,3,4,3};
        System.out.println(Arrays.toString(twoRepeated(array,N)));
    }
}
