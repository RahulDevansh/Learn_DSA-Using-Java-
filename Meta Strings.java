//https://practice.geeksforgeeks.org/problems/meta-strings5713/1

import java.util.*;
public class Main
{   
    public static boolean metaStrings(String S1, String S2) 
    { 
        char[] s1= S1.toCharArray();
        char[] s2=S2.toCharArray();
        if(S1.length()!=S2.length()) {
            return false;
        }
        if(S1.equals(S2)) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<S1.length();i++){
            if(S1.charAt(i)!=S2.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()==2){
            int f=list.get(0);
            int s=list.get(1);
            char temp=s2[f];
            s2[f]=s2[s];
            s2[s]=temp;
            boolean ans=true ;
            for(int i=0;i<s1.length;i++) {
                if(s1[i]!=s2[i]) {
                    ans= false;
                    break;
                }
            }
            return ans;
        } 
        else {
           return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "keegs";
        System.out.println(metaStrings(s1,s2));
    }
}

