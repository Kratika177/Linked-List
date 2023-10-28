/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head.next==null ||head==null){
            return true;
        }
        Node slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow.next;
        Node curr=mid;
        Node prev=null;
        
        while(curr!=null){
            mid=mid.next;
            curr.next=prev;
            prev=curr;
            curr=mid;
        }
        slow.next=prev;
        
        if(prev!=null && head.data!=prev.data){
            return false;
        }
        while(prev!=null && prev.next!=null){
            if(head.data!=prev.data){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        if(head.data!=prev.data){
            return false;
        }
        return true;
    }    
}

