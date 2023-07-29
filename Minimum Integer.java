//https://practice.geeksforgeeks.org/problems/1ccf56f107bcb24242469ea45c02f852165a2184/1?
public class Main
{   
     public static int minimumInteger(int N, int[] A) {
        // code here
        long sum=0;
        int i,min=Integer.MAX_VALUE;
        for(i=0;i<N;i++)
        {
            sum+=A[i];
        }
        
        for(i=0;i<N;i++)
        {
            if(sum<=(long)N*(long)A[i])
            {
                min=Math.min(min,A[i]);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int N = 3;
        int A[] = { 1, 3, 2};
        System.out.println(minimumInteger(N,A));
    }
}
