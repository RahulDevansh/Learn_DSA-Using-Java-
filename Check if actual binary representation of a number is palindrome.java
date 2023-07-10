// https://practice.geeksforgeeks.org/problems/check-if-actual-binary-representation-of-a-number-is-palindrome0624/1?page=1&difficulty[]=0&status[]=solved&category[]=Strings&sortBy=submissions
public class Main
{   
     public static boolean binaryPalin (long N)
    {
        long n=N;
        String binary1="";
        String binary="";
        while(n!=0){
            long rem=n%2;
            binary1+=rem;
            n=n/2;
        }
        for(int i=binary1.length()-1;i>=0;i--){
            char c=binary1.charAt(i);
            binary=binary+c;
        }
        if(binary.charAt(0)=='0')
        return true ;
        if(binary1.equals(binary)){
            return true;
        } else {
            return false;
        }   
    }
    public static void main(String[] args) {
        long N=5;
        System.out.println(binaryPalin(N));
    }
}

