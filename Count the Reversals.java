//https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1?
public class Solution
{   
    static int countRev (String s)
    {
        // your code here 
        if(s.length()%2!=0){
            return -1;
        }
        int opening =0;
        int closing=0;
        int revans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                opening++;
            }  else{
                if(opening==0){
                    closing++;
                }
                else {
                    opening--;
                }
            }
        }
        revans=(int)(Math.ceil(opening/2.0)+Math.ceil(closing/2.0));
        return revans;
    }
    public static void main(String[] args) {
        String s="}{{}}{{{";
        System.out.println(countRev (s));
    }
}
