//https://practice.geeksforgeeks.org/problems/in-first-but-second5423/1?page
import java.util.*;
public class Main
{   
    static ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> ans  =new ArrayList<>();
        HashSet<Long> set=new HashSet<>();
        
        for(int i=0;i<M;i++){
            set.add(B[i]);
        }
        for(int i=0;i<N;i++){
            if(!set.contains(A[i])){
                ans.add(A[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 6;
        int M = 5;
        long A[] = {1, 2, 3, 4, 5, 10};
        long B[] = {2, 3, 1, 0, 5};
        System.out.println(findMissing(A, B,N,M));
    }
}
