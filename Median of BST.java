//https://practice.geeksforgeeks.org/problems/median-of-bst/1
class Tree
{
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> al=new ArrayList<>();
        inOrder(al,root);
        int size=al.size();
        if (size%2==0) return (float)(al.get(size/2 -1) + al.get(size/2))/2;
        else return al.get(size/2);
    }
     public static void inOrder(ArrayList<Integer> al,Node root){
        if (root==null) return;
        inOrder(al,root.left);
        al.add(root.data);
        inOrder(al,root.right);
    }
}
