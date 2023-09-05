/*
// Definition for a Node.
//https://leetcode.com/problems/copy-list-with-random-pointer/description/?envType=daily-question&envId=2023-09-05
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while(temp != null) {
            Node next = temp.next;
            Node clone = new Node(temp.val);
            temp.next = clone;
            clone.next = next;
            temp = next;
        }
        temp = head;
        while(temp != null) {
            if(temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node cloneHead = new Node(0);
        Node tempHead = cloneHead;
        temp = head;
        while(temp != null) {
            Node next = temp.next.next;
            Node clone = temp.next;
            tempHead.next = clone;
            tempHead = clone;
            temp.next = next;
            temp = next;
        }
        return cloneHead.next;
    }
}

// Refrences : 
// https://www.youtube.com/watch?v=83mPr0i56Gg
// https://leetcode.com/problems/copy-list-with-random-pointer/solutions/43491/a-solution-with-constant-space-complexity-o-1-and-linear-time-complexity-o-n/
