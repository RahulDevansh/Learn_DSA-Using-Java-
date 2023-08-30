// https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
// Input: 1 -> 3 -> 4 
// x = 3
// Output: 1 -> 3
class GfG
{
    Node deleteNode(Node head, int x)
    {
        if(head == null || head.next == null)
	return head;
	if(x == 1)
	return head.next;
	Node prev = null;
	Node curr = head;
	x--;
	while(curr != null){
	    if(x == 0){
	        prev.next = curr.next;
	        break;
	    }
	    prev = curr;
	    curr = curr.next;
	    x--;
	}
	return head;
    }
}
