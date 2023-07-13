//https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends
class twoStacks
{
    //Function to push an integer into the stack1.
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    void push1(int x)
    {
       list.add(x);
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       list2.add(x);
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {   
        if(list.isEmpty()){
            return -1;
        } else {
            return list.remove(list.size()-1);
        }
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(list2.isEmpty()){
            return -1;
        } else {
            return list2.remove(list2.size()-1);
        }
    }
}

