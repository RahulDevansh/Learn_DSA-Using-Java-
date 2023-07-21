//https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?
import java.util.*;
import java.lang.Math;
public class Main
{   
    static int minDist(int arr[], int n, int x, int y) {
        int a=-1,b=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                a=i;
            }else if(arr[i]==y){
                b=i;
            }
            if(a!=-1 && b!=-1 && min>Math.abs(a-b)){
                min=Math.abs(a-b);
            }
        }
        if(a==-1 || b==-1){
            return -1;
        }
        return min;
    }
    public static void main(String[] args) {
       int N = 4;
       int[] A = {1,2,3,2};
       int x = 1; 
       int y = 2;
       System.out.println(minDist(A, N,x,y));
    }
}
