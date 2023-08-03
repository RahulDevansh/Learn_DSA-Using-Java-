//https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1?
import java.util.*;
public class Main
{   
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<patt.length();i++){
            map.put(patt.charAt(i),1);
        }
        int index=-1;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                index=i;
                break;
            }
        }
        if(index > -1){
            return index;
        }
        return index;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";
        System.out.println(minIndexChar(str, patt));
    }
}
