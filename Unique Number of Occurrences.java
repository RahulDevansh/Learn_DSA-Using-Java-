//https://practice.geeksforgeeks.org/problems/unique-frequencies-of-not/1
//Unique Number of Occurrences
import java.util.*;
public class Main
{   public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            } else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        HashSet<Integer> s = new HashSet<>(map.values());
        return s.size() == map.size() ;
    }
    public static void main(String[] args) {
      int  N = 10;
      int[] arr = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
      System.out.println(isFrequencyUnique(N,arr));
    }
}
