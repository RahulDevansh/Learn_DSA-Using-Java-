//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
class BST {
	Node LCA(Node root, int n1, int n2) {
        // code here.
        if(root.data>n1 && root.data>n2)return LCA(root.left,n1,n2);
        else if(root.data<n1 && root.data<n2)return LCA(root.right,n1,n2);
        else return root;
    } 
}
