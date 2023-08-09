//https://practice.geeksforgeeks.org/problems/print-bracket-number4058/1?
/*
Input:  S = "(aa(bdc))p(dee)"
Output: 1 2 2 1 3 3
*/
class Solution {
    ArrayList<Integer> bracketNumbers(String S) {
        // code here
        int open = 0;
        int close = 0;
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(char ch : S.toCharArray())
        {
            if(ch == '(')
            {
                open++;
                stk.push(open);
                list.add(stk.peek());
            }
            if(ch == ')')
            {
                list.add(stk.peek());
                stk.pop();
            }
        }
        return list;
    } 
}
