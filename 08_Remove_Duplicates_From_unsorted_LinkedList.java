/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashMap<Integer,Boolean> mp=new HashMap<>();
         Node curr=head;
         Node prev=curr;
         if(head==null ||head.next==null){
             return head;
         }
         while(curr!=null){
             if(mp.containsKey(curr.data)){
                 prev.next=curr.next;
             }
             else{
                 mp.put(curr.data,true);
                 prev=curr;
             }
             
             curr=curr.next;
         }
         
         return head;
    }
}
