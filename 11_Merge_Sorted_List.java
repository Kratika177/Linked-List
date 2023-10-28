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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode merged=new ListNode(0);
        ListNode temp=merged;
        if(list1==null){
            merged.next=list2;
        }
        else if(list2==null){
            merged.next=list1;
        }
        else{
            while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode newnode=new ListNode(list1.val);
                temp.next=newnode;
                temp=temp.next;
                list1=list1.next;
            }
            else{
                ListNode newnode=new ListNode(list2.val);
                temp.next=newnode;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            while(list2!=null){
                ListNode newnode=new ListNode(list2.val);
                temp.next=newnode;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list2==null){
            while(list1!=null){
                ListNode newnode=new ListNode(list1.val);
                temp.next=newnode;
                temp=temp.next;
                list1=list1.next;
            }
        }
        }
        
        return merged.next;
    }
}
