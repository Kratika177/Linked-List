/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    //Function to clone a linked list with next and random pointer.
    Node search(Node copy,int data){
        if(copy==null){
            return null;
        }
        while(copy!=null){
            if(copy.data==data){
                return copy;
            }
            copy=copy.next;
        }
        return null;
    }
    Node copyList(Node head) {
        // your code here
        Node copy=new Node(-1);
        Node tempcopy=copy;
        Node temp=head;
        if(head==null){
            return null;
        }
        while(temp!=null){
            tempcopy.next=new Node(temp.data);
            tempcopy=tempcopy.next;
            temp=temp.next;
        }
        temp=head;
        tempcopy=copy.next;
        Map<Node,Node> mp=new HashMap<>();
        while(temp!=null){
            mp.put(temp,tempcopy);
            temp=temp.next;
            tempcopy=tempcopy.next;
        }
        temp=head;
        tempcopy=copy.next;
        while(tempcopy!=null){
            tempcopy.arb=mp.get(temp.arb);
            tempcopy=tempcopy.next;
            temp=temp.next;
        }
        return copy.next;
    }
}
