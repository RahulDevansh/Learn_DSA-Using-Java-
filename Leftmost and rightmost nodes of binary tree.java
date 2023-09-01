//https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1
/* Input :
         1
       /  \
     2      3
    / \    / \
   4   5  6   7    
Output: 1 2 3 4 7
*/
class Tree
{
    public static void printCorner(Node root)
    {
        
        // add your code her
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                temp.add(curr.data);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(temp.size()==1){
                System.out.print(temp.get(0)+" ");
            }
            else{
                System.out.print(temp.get(0)+" ");
                System.out.print(temp.get(temp.size()-1)+" ");
            }
        }
    }
    
    
}
