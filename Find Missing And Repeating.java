//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?
import java.util.*;
public class Main
{   
    static int[] findTwoElement(int arr[], int n) {
        int duplicate=-1;
        int sum=0;
        int sumofpossible =(n*(n+1))/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            boolean dup=set.add(arr[i]);
            if(!dup){
                duplicate=arr[i];
            }
            if(dup){
                sum+=arr[i];
            }
        }
        int missingnumber=(sumofpossible-sum);
        int result[]={duplicate,missingnumber};
        
        return result ;
    }
    public static void main(String[] args) {
        int N = 3;
        int Arr[] = {1, 3, 3};
        System.out.println(Arrays.toString(findTwoElement(Arr, N)));
    }
}
