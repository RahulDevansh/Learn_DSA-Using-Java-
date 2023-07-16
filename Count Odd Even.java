//https://practice.geeksforgeeks.org/problems/count-odd-even-java/1?
import java.util.*;
public class Main
{   
    static void countOddEven(int a[], int n) {
        int s=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                s++;
            }
        }
        int val=n-s;
        System.out.print(n-s);
        System.out.print(" ");
        System.out.print(s);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1, 2, 3, 4, 5};
        countOddEven(arr,n);
    }
}
