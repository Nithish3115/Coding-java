class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null){
            return null;
        }
        int sum=0;
        ListNode node=head;
        while(node!=null){
            sum+=node.val;
            if(sum==0){
                head=node.next;
                return removeZeroSumSublists( head);
            }
            node=node.next;
        }
        head.next=removeZeroSumSublists( head.next);
        return head;
    }
}