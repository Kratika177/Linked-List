class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        //Initializing count of 0s 1s and 2s
        int zeroC=0;
        int oneC=0;
        int twoC=0;
        
        //Traversing list and count data for zero, one and two
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zeroC++;
            }
            if(temp.data==1){
                oneC++;
            }
            if(temp.data==2){
                twoC++;
            }
            temp=temp.next;
        }
        
        //reset the temp Node to head;
        temp=head;
        
        //Traverse and replace the data
        while(temp!=null){
            if(zeroC!=0){
                temp.data=0;
                zeroC--;
            }
            else if(oneC!=0){
                temp.data=1;
                oneC--;
            }
            else if(twoC!=0){
                temp.data=2;
                twoC--;
            }
            temp=temp.next;
        }
        return head;
    }
}
