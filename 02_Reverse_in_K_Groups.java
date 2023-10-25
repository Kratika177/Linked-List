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
    public ListNode reverseKGroup(ListNode head, int k) {
          //handle the base condition
          if(head==null){
              return null;
          }
          //handle single case by iterative method
          ListNode prev=null;
          ListNode next=null ;
          ListNode cur=head;
          int c=0;
          while(cur!=null && c<k){
              next=cur.next;
              cur.next=prev;
              prev=cur;
              cur=next;
              c++;
          }

          //handle recursion call
          if(next!=null){
              head.next=reverseKGroup(next,k);
          }
          return prev;
        
    }
}
