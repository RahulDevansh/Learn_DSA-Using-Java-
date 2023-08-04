
//https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1?
import java.util.*;
public class Main
{   
    static void rearrange(int arr[], int n) {
        // code here
        int pos = 0;
        int neg = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg++;
            } else {
                pos++;
            }
        }
        
        int positive[] = new int[pos];
        int negative[] = new int[neg];
        
        int positiveIndex = 0;
        int negativeIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative[negativeIndex++] = arr[i];
            } else {
                positive[positiveIndex++] = arr[i];
            }
        }
        
        int arrIndex = 0;
        positiveIndex = 0;
        negativeIndex = 0;
        
        while (positiveIndex < pos && negativeIndex < neg) {
            arr[arrIndex++] = positive[positiveIndex++];
            arr[arrIndex++] = negative[negativeIndex++];
        }
        
        while (positiveIndex < pos) {
            arr[arrIndex++] = positive[positiveIndex++];
        }
        
        while (negativeIndex < neg) {
            arr[arrIndex++] = negative[negativeIndex++];
        }
    }
    public static void main(String[] args) {
        int N = 10;
        int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(Arr, N);
        for(int num: Arr){
            System.out.print(num+" ");
        }
    }
}
