//https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1?
class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        int first=-1;
        int last=-1;
        for(int i=0;i<v.length;i++){
            if(v[i]==x){
                first=i;
                break;
            }
        }
        for(int i=v.length-1;i>=0;i--){
            if(v[i]==x){
                last=i;
                break;
            }
        }
        
        pair newpair = new pair(first,last);
        return newpair;
    }
}
