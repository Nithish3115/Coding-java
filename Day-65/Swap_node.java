class Solution {
    public ListNode swapNodes(ListNode head, int k) {
      
        ListNode l=head;
        ListNode fast=head;
        for(int i=1;i<k;i++){
            l=l.next;
            fast=fast.next;
        }
       
          
        
        ListNode r=head;
        while(fast.next!=null){
            fast=fast.next;
            r=r.next;
        }
        int temp=l.val;
        l.val=r.val;
        r.val=temp;
        return head;
    }
}