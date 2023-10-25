/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	    if(head==null){
	        return true;
	    }
	    if(head.next==null){
	        return false;
	    }
	    if(head.next==head){
	        return true;
	    }
	    Node temp=head.next;
	    while(temp!=null && temp.next!=head){
	        temp=temp.next;
	    }
	    if(temp==null){
	        return false;
	    }
	    return true;
    }
}
