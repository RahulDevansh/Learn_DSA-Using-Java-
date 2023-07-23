//https://practice.geeksforgeeks.org/problems/sum-equals-to-sum4006/1?
import java.util.*;
public class Main
{   
    public static int findPairs(int arr[],int n) 
    { 
        // Time Limits is not good with 
        //int ans=0;
        // ArrayList<Integer> list =new ArrayList<>();
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         list.add(arr[i]+arr[j]);
        //     }
        // }
        // int m=list.size();
        // for(int i=0;i<m-1;i++){
        //     for(int j=i+1;j<m;j++){
        //         if(list.get(i)==list.get(j)){
        //             ans=1;
        //             break;
        //         }
        //     }
        // }
        // return ans ;
        
        // Good Time Complexity 
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sump = arr[i]+arr[j];
                if(set.contains(sump)){
                    return 1;
                }
                set.add(sump);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int N=7;
        int A[] = {3, 4, 7, 1, 2, 9, 8};
        System.out.println(findPairs(A,N));
    }
}
