//https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1?
public class Main
{   
    static int transitionPoint(int arr[], int n) {
        // code here
        int index=arr[0];
        int one=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(index!=arr[i]){
                return i;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==0){
                zero++;
            }
        }
        int ans=0;
        if(n==zero){
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {0,0,0,1,1};
        System.out.println(transitionPoint(arr,N));
    }
}
