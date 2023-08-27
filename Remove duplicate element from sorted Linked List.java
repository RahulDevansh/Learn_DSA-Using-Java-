// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
/*
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
*/
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	Node curr = head;
	while(curr.next!=null && curr.next.next!=null){
	    if(curr.data==curr.next.data){
	        curr.next=curr.next.next;
	     
	    }else curr=curr.next;
	}
	if(curr.next!=null && curr.next.data==curr.data){
	    curr.next=null;
	}
	return head;
    }
}
