// https://practice.geeksforgeeks.org/problems/leaf-under-budget/1
/*
Input: 
                  10
                /    \
               8      2
             /      /   \
            3      3     6
                    \
                     4
and budget = 8
Output: 2
*/
class Solution{
    public int getCount(Node node, int bud)
    {
        //code here  
         if(node==null||bud==0) return 0;
        int level=0;
        //int ans=0;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int count=0;
       
        while(!q.isEmpty()){
            int n = q.size();
            level++;
            int i=0;
            while(i!=n){
                Node temp = q.poll();
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
                if(temp.left==null&&temp.right==null){
                   if(bud>=level){
                       bud=bud-level;
                       count++;
                   }
                }
                i++;
            }
        }
        
        return count;
    }
}
