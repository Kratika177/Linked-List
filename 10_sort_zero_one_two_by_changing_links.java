class Solution
{

    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        //dummy head
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        
        //dummy tail
        Node zeroTail=zeroHead;
        Node oneTail=oneHead;
        Node twoTail=twoHead;
        
        //temporary node
        Node temp=head;
        
        //traverse list
        while(temp!=null){
            if(temp.data==0){
                zeroTail.next=temp;
                zeroTail=temp;
            }
            if(temp.data==1){
                oneTail.next=temp;
                oneTail=temp;
            }
            if(temp.data==2){
                twoTail.next=temp;
                twoTail=temp;
            }
            temp=temp.next;
        }
        
        //Merging all three list
        
        if(oneHead.next!=null){
            zeroTail.next=oneHead.next;
        }
        else{
            zeroTail.next=twoHead.next;
        }
        oneTail.next=twoHead.next;
        twoTail.next=null;
        head=zeroHead.next;
        
        zeroHead=null;
        oneHead=null;
        twoHead=null;
        
        
        return head;
    }
}


