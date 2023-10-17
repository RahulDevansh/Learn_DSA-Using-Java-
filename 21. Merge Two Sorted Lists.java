//https://leetcode.com/problems/merge-two-sorted-lists/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 =list1;
        ListNode temp2 =list2;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp1 !=null) {
           list.add(temp1.val);
           temp1 =temp1.next;
        }
        while(temp2 !=null) {
            list.add(temp2.val);
            temp2 =temp2.next;
        }
        Collections.sort(list, Collections.reverseOrder()); 

        ListNode head = null;
        for(int i=0;i<list.size();i++){
            ListNode node = new ListNode(list.get(i));
            if(head ==null) {
                head = node;
            }
            else {
                node.next =head;
                head =node;
            }
        }
        return head ;
    }
}
