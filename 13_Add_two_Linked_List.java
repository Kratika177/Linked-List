/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to reverse the LL
    static Node reverseLL(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            head=head.next;
            curr.next=prev;
            prev=curr;
            curr=head;
        }
        return prev;
    }
    
    
    //Function to add
    static Node add(Node first,Node second){
        
        Node ansHead=null;
        Node ansTail=null;
        int carry=0;
        while(first!=null && second!=null){
            int sum=first.data+second.data+carry;
            int digit=sum%10;
            
            //insertAtTail
            Node newNode=new Node(digit);
            if(ansHead==null && ansTail==null){
                ansHead=newNode;
                ansTail=newNode;
            }
            else{
                ansTail.next=newNode;
                ansTail=newNode;
            }
            //end
            
            carry=sum/10;
            first=first.next;
            second=second.next;
        }
        
        while(first!=null){
            
            int sum=carry+first.data;
            int digit=sum%10;
            //insertAtTail
            Node newNode=new Node(digit);
            if(ansHead==null && ansTail==null){
                ansHead=newNode;
                ansTail=newNode;
            }
            else{
                ansTail.next=newNode;
                ansTail=newNode;
            }
            //end
            carry=sum/10;
            first=first.next;
        }
        
        while(second!=null){
            int sum=carry+second.data;
            int digit=sum%10;
           //insertAtTail
            Node newNode=new Node(digit);
            if(ansHead==null && ansTail==null){
                ansHead=newNode;
                ansTail=newNode;
            }
            else{
                ansTail.next=newNode;
                ansTail=newNode;
            }
            //end
            carry=sum/10;
            second=second.next;
        }
        while(carry!=0){
            int sum=carry;
            int digit=sum%10;
           //insertAtTail
            Node newNode=new Node(digit);
            if(ansHead==null && ansTail==null){
                ansHead=newNode;
                ansTail=newNode;
            }
            else{
                ansTail.next=newNode;
                ansTail=newNode;
            }
            carry=sum/10;
        }
        
        return ansHead;
    }
    
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        //reverse first number 
        first=reverseLL(first);
        
        //reverse second number
        second=reverseLL(second);
        
        //Add the numbers
        Node ans=add(first,second);
        
        //reverse the answer
        ans=reverseLL(ans);
        
        //return answer
        return ans;
        
        
        
    }
}
