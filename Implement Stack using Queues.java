//https://leetcode.com/problems/implement-stack-using-queues/description/
/*
Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]
*/

class MyStack {
    ArrayDeque<Integer> ans ;
    public MyStack() {
        ans= new ArrayDeque<>();
    }
    
    public void push(int x) {
        ans.addLast(x);
    }
    
    public int pop() {
        return ans.removeLast();
    }
    
    public int top() {
        return ans.peekLast();
    }
    
    public boolean empty() {
        return ans.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
