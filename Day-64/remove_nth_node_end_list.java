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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode res=new ListNode();
         res.next=head;
         ListNode slow=res;
         ListNode fast=res;
         for(int i=0;i<n+1;i++){
            fast=fast.next;
         }
         while(fast!=null){
            fast=fast.next;
            slow=slow.next;
         }
         slow.next=slow.next.next;
         return res.next;
    }
}