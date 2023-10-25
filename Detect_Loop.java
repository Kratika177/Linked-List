/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head;
        Node fast=head;
        if(head==null || head.next==null){
            return false;
        }
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
