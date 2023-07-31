//https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?
import java.util.*;
public class Main
{   
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        /*
        Taking Longer Time 
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(a[i]);
        }
        int counter=0;
        for(int i=0;i<m;i++){
            if(list.contains(b[i])){
                counter++;
            }
        }
        return counter;
        */
        
        // Good Time Complexity
        HashSet<Integer> set=new HashSet<>();
         for (int num : a) {
            set.add(num);
        }
        int count = 0;
        // Check elements from the second array and count common elements
        for (int num : b) {
            if (set.contains(num)) {
                count++;
                // Remove the element from the set to avoid duplicates
                set.remove(num);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5, m = 3;
        int a[] = {89, 24, 75, 11, 23};
        int b[] = {89, 2, 4};
        System.out.println(NumberofElementsInIntersection(a, b, n, m));
    }
}
