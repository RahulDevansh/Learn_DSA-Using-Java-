
//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/0
import java.util.*;
public class Main
{   
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        long[] list = new long[n+m];
        for(int i=0;i<n;i++){
            list[i]=arr1[i];
        }
        int i=n;
        for(int j=0;j<m;j++){
            list[i]=arr2[j];
            i++;
        }
        Arrays.sort(list);
        return list[k-1];
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5,n=arr1.length,m=arr2.length;
        System.out.println(kthElement(arr1,arr2, n, m, k) );
    }
}
