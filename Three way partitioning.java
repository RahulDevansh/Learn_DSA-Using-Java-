
//https://practice.geeksforgeeks.org/problems/three-way-partitioning/1?
import java.util.*;
public class Main
{   
    public static void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]<a){
                list.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>=a && array[i]<=b){
                list.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>b){
                list.add(array[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
    }
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 3, 4};
        int a=1, b = 2;
        threeWayPartition(A, a, b);
        for(int num: A){
            System.out.print(num+" ");
        }
    }
}
