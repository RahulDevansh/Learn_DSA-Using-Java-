//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
class Solution
{
    public static Node reverse(Node node, int k)
    {
        if(node.next==null||k==1){
          return node;
      }    
       Node head=node;
       Node x=node;
       Node temp=node;
       Node prev=null;
       Node y=null;
       int c=0;
       boolean flag=false;
       while(temp!=null)
       {
          if(c==k){
            
              if(!flag){
                  head=prev;
                  flag=true;
              }else{
             node.next=prev;
             flag=true;
             node=y;
              }
             y=temp;
             prev=null;
             c=0;
          }
          else {
          x=temp.next;
          temp.next=prev;
          prev=temp;
          temp=x;
          c++;
          }   
       }
      if(!flag){
          return prev;
      }
        node.next=prev;
        return head;
    }
}
