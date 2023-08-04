//https://practice.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements3133/1?
/*
    Input:
    N  = 7
    A[] = {20, 8, 22, 4, 12, 10, 14}
    K1 = 3, K2 = 6
    Output:
    26
*/
class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        Arrays.sort(A);
        long sub=-1;
        long max1=A[(int)(K1-1)];
        long max2=A[(int)(K2-1)];
        long sum=0;
        for(int i=0;i<N;i++){
            if(A[i]> max1 && A[i]<max2){
                sum+=A[i];
            }
        }
        return sum;
    }
}
