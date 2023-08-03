//https://practice.geeksforgeeks.org/problems/find-first-repeated-character4108/1?
import java.util.*;
public class Main
{   
    static String firstRepChar(String s) 
    { 
        // code here
        String ans="-1";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                return ""+s.charAt(i);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        String S="geeksforgeeks";
        System.out.println(firstRepChar(S));
    }
}
