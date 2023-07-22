//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        Node tail = head;
        map.put(tail.data, 1);
        while(tail != null && tail.next != null){
            if(!map.containsKey(tail.next.data)){
                map.put(tail.next.data, 1);
                tail = tail.next;
            }else{
                while(tail.next != null && map.containsKey(tail.next.data)){
                    tail.next = tail.next.next;
                }
            }
        }
        return head;
    }
}
