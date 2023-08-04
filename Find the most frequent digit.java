//https://practice.geeksforgeeks.org/problems/find-the-most-frequent-digit4432/1?
/*
    N = "12234"
    Output:2
*/
class Solution 
{ 
    String solve(String N) 
    { 
        // code here
       int [] arr = new int[10];
       for(char c:N.toCharArray()){
           arr[Integer.parseInt(c+"")]++; 
       }
       
       int max =0;
       String res ="";
       for(int i=arr.length-1; i>=0; i--){
           if(arr[i] > max){
               res = i+"";
               max = arr[i];
           }
       }
       return res;
    }
} 

