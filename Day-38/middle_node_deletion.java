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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
          if(head.next==null){
            return null;
        }
        ListNode prv=null;

        while((fast !=null)&&(fast.next!=null)){
            prv=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       prv.next=prv.next.next;
       return head;
    }
}