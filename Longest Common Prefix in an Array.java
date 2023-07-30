
//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?
import java.util.*;
public class Main
{   
    static String longestCommonPrefix(String arr[], int n){
        // code here
        int maxlen=arr[0].length();
        int strindex=0;
        for(int i=1;i<n;i++){
            int len=arr[i].length();
            if(maxlen<len){
                maxlen=len;
                strindex=i;
            }
        }
        if(n==1) {
            return arr[n-1];
        }
        ArrayList<Integer> list = new ArrayList<>();
        String str=arr[strindex];
        for(int i=0;i<arr.length;i++){
            String neo=arr[i];
            int lastindex=0;
            for(int j=0;j<neo.length();j++){
                char ch =neo.charAt(j);
                if(str.charAt(j)==ch){
                    lastindex++;    
                } else {
                    break;
                }
            }
            list.add(lastindex);
            lastindex=0;
        }
        Collections.sort(list);
        int last =list.get(0);
        if(last==0){
            return "-1";
        } else {
            String result=str.substring(0,last);
            return result ;
        }
    }
    public static void main(String[] args) {
        int N = 4;
        String arr[] = {"geeksforgeeks", "geeks", "geek","geezer"}; 
        System.out.print(longestCommonPrefix(arr, N));
    }
}
