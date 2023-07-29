//https://practice.geeksforgeeks.org/problems/inorder-successor-in-bst/1
class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	private Node suc(Node root, Node key){
        while(root != null){
            if(key.data < root.data){
                suc = root;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return suc;
    }
    Node suc;
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          return suc(root, x);
         }
}
