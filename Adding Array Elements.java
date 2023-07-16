//https://practice.geeksforgeeks.org/problems/adding-array-element4756/1?
import java.util.*;
public class Main
{   
    public static Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(4);
        q.add(3);
        q.add(1);
        q.add(10);
        q.add(2);
        q.add(6);
        int N = 4;
        System.out.println(rev(q));
    }
}

