//https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
//Input:
//LinkedList = 12->15->10->11->5->6->2->3
//Output: 15 11 6 3
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node temp = head ;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while(temp!=null) {
            list.add(temp.data);
            temp =temp.next ;
        }
        int max =list.get(list.size()-1);
        list2.add(max);
        for(int i=list.size()-2;i>=0;i--) {
            if(list.get(i)>=max) {
                max=list.get(i);
                list2.add(max);
            }
        }
        Node tt =null;
        for(int i=0;i<list2.size();i++) {
            Node n = new Node(list2.get(i));
            if(tt==null) {
                tt=n;
            } else {
                n.next =tt;
                tt =n;
            }
        }
        head =tt;
        return head ;
    }
}
