//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
class Solution
{
        //Function to sort a linked list of 0s, 1s and 2s.
        static Node answer(ArrayList<Integer>list ){
        Node ans=null;
        for(int i=0;i<list.size();i++){
            Node node =new Node(list.get(i));
            if(ans==null){
                ans=node;
            }
            else {
                node.next=ans;
                ans=node;
            }      
        }
        return ans;
    }
    static Node segregate(Node head)
    {
        // add your code here
        Node temp=head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list, Collections.reverseOrder());
        temp = answer(list);
        return temp;
    }
}
