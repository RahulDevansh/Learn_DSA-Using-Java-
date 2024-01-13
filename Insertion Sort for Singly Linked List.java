// https://www.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/1
class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
        Node dummy = head;
        
        for(Node i = head; i != null; i = i.next){
            for(Node j = i.next; j != null; j = j.next){
                if(i.data > j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        return dummy;
    }
}
