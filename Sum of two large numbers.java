//https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1?
public class Solution
{   
    static String findSum(String X, String Y) {
        // code here
        //working good till 1000 test case
        //can not have that much capability
        /* long num1=0,num2=0,sum=0;
        for(int i=0;i<X.length();i++){
            long num=X.charAt(i)-'0';
            num1=(num1*10)+num;    
        }
        for(int i=0;i<Y.length();i++){
            long num=Y.charAt(i)-'0';
            num2=(num2*10)+num;
        } 
        sum=num1+num2;
        return sum+""; */
        
        // working good 
        java.math.BigInteger bi1=new java.math.BigInteger(X);
        java.math.BigInteger bi2=new java.math.BigInteger(Y);
        return bi1.add(bi2)+"";
    }

    public static void main(String[] args) {
        String X = "2500", Y = "23";
        System.out.println(findSum(X, Y));
    }
}
