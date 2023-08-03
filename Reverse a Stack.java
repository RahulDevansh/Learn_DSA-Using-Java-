//https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
import java.util.*;
public class Main
{   
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        while(!s.empty()){
           list.add(s.pop()); 
        }
        for(int i=0;i<list.size();i++){
            s.push(list.get(i));
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(7);
        s.push(6);
        reverse(s);
    }
}
