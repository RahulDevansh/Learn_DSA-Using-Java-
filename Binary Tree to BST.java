//https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1
class Solution{
    Node binaryTreeToBST(Node root){
      ArrayList<Integer> arr=new ArrayList<>();
      inorder(root,arr);
      Collections.sort(arr);
      return buildBST(arr,0,arr.size()-1);
    }
    Node buildBST(ArrayList<Integer> arr,int low,int high){
        if(low>high) return null;
        
        int mid=low+(high-low)/2;
        Node root=new Node(arr.get(mid));
        root.left=buildBST(arr,low,mid-1);
        root.right=buildBST(arr,mid+1,high);
        return root;
    }
    void inorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
}
