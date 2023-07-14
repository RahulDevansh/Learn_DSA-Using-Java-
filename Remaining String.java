//practice.geeksforgeeks.org/problems/remaining-string3515/1?
import java.util.*;
public class Main
{   
    static String printString(String S, char ch, int count) {
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        int x = -1;
        for(int i = count; i!=0; i--){
            String st = sb.substring(x+1);
            x = st.indexOf(ch);
            if(x == -1){
                return "Empty string";
            } 
           sb.delete(0, x+1);
           x = -1;
        }
        if(sb.length() == 0){
           return "Empty string";
        }
        return sb.substring(0);
    }
    public static void main(String[] args) {
       String S = "Thisisdemostring";
       char ch = 'i'; 
       int count = 3;
       System.out.println(printString(S,ch,count));
    }
}
