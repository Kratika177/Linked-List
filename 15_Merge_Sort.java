//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to find middle
    static Node Middle(Node head){
        Node slow=head;
        Node fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    //Function to merge
    static Node merge(Node left,Node right){
        Node ans=new Node(-1);
        Node temp=ans;
        if(left==null){
            ans.next=right;
        }
        else if( right==null){
            ans.next=left;
        }
        else{
            while(left!=null && right!=null){
                
                if(left.data<right.data){
                    ans.next=left;
                    ans=left;
                    left=left.next;
                }
                else{
                    ans.next=right;
                    ans=right;
                    right=right.next;
                }
            }
            while(left!=null){
                    ans.next=left;
                    ans=left;
                    left=left.next;
            }
            while(right!=null){
                    ans.next=right;
                    ans=right;
                    right=right.next;
            }
        }
        return temp;
    }
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // Base condition
        if(head==null ||head.next==null){
            return head;
        }
        
        //calling function to Middle function which returns the middle node
        Node mid=Middle(head);
        
        //divide the linkedList to 2
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        
        //mergesort
        left=mergeSort(left);
        right=mergeSort(right);
        
        Node ans=merge(left,right);
        return ans.next;
    }
}


