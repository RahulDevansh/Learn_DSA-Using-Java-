//https://practice.geeksforgeeks.org/problems/multiply-two-strings/1?
import java.util.*;
import java.math.*;
public class Main
{   
    public static String multiplyStrings(String s1,String s2)
    {
        //code here.
        // Not working Beacuse Sometimes Input is very large 
        // long num1=0;
        // long num2=0;
        // for(int i=0;i<s1.length();i++){
        //     if(s1.charAt(i)!='-'){
        //         long num=s1.charAt(i)-'0';
        //         num1=(num1*10)+num;    
        //     }
            
        // }
        // if(s1.charAt(0)=='-'){
        //     num1=-num1;
        // }
        // for(int i=0;i<s2.length();i++){
        //     if(s2.charAt(i)!= '-'){
        //         long num=s2.charAt(i)-'0';
        //         num2=(num2*10)+num;
        //     } 
            
        // }
        // if(s2.charAt(0)=='-'){
        //     num2=-num2;
        // }
        // long product =num1*num2;
        // return ""+product;
        
        //Use This 
        BigInteger bg1=new BigInteger(s1);
        BigInteger bg2=new BigInteger(s2);
    
        return bg1.multiply(bg2)+"";
    }

    public static void main(String[] args) {
        String s1 = "33";
        String s2 = "2";
        System.out.println(multiplyStrings(s1,s2));
    }
}
