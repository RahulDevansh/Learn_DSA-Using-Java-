
//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?
import java.util.*;
public class Main
{   
    public static String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(a1[i]);
        }
        for(int i=0;i<m;i++){
            if(list1.contains(a2[i])){
                list1.remove(a2[i]);
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};
        long n = 8;
        long m = 5;
        System.out.println(isSubset(a1, a2, n, m));
    }
}
