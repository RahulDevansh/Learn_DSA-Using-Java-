import java.util.*;
//https://practice.geeksforgeeks.org/problems/count-the-elements1529/1?
public class Solution
{   
    public static int cheak(int num,int b[]){
        int count=0;
        for(int i=0;i<b.length;i++){
            if(b[i]<=num){
                count++;
            }
        }
        return count;
    }
    public static int[] find(int a[],int b[],int q[])
    {  
        int result[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            int result1 =cheak(a[q[i]],b);
            result[i]=result1;
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 7, 9};
        int b[] = {0, 1, 2, 1, 1, 4}; 
        int q[]={5,4};
        System.out.println(Arrays.toString(find(a,b,q)));
    }
}
