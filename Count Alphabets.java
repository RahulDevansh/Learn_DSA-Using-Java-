//https://practice.geeksforgeeks.org/problems/count-alphabets3649/1?
/*
    S = "adjfjh23"
    Output: 6
*/
class Solution{
    static int Count(String S)
    {
        // code here
        int count=0;
        for(int i=0;i<S.length();i++){
            int ch =S.charAt(i) ;
            if(ch>=97 && ch<=122){
                count++;
            }
            if(ch>=65 && ch<=90){
                count++;
            }
        }
        return count;
    }
}

