class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>  stack = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='[' || x.charAt(i)=='{' || x.charAt(i)=='('){
                stack.push(x.charAt(i));
            }
            if(x.charAt(i)==']' || x.charAt(i)=='}' || x.charAt(i)==')'){
                if(stack.size()==0){
                    return false ;
                }
                char top=stack.peek();
                if((x.charAt(i)==']' && top=='[') || (x.charAt(i)=='}' && top=='{') || (x.charAt(i)==')' && top=='(')) {
                    stack.pop();                    
                }
                else {
                    return false ;
                }
            }
        }
        return stack.isEmpty();
    }
}
