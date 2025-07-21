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
    public ListNode reverseList(ListNode head) {
        ListNode prv=new ListNode();
        prv=null;
        ListNode nxt=null;
        while(head!=null){
           nxt=head.next;
           head.next=prv;
           prv=head;
           head=nxt;
        }   
        return prv;     
    }
}