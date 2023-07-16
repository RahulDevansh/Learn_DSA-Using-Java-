//https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1?
import java.util.*;
public class Main
{   
     public static int findExtra(int a[], int b[], int n) {
        for(int i=0;i<n-1;i++){
            if(a[i]-b[i]!=0){
                return i;
            }
        }
        return n-1;
    }
    public static void main(String[] args) {
        int N = 7;
        int A[] = {2,4,6,8,9,10,12};
        int B[] = {2,4,6,8,10,12};
        System.out.println(findExtra(A,B,N));
    }
}

