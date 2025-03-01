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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty list or single node is a palindrome
        }

        // Find the middle of the linked list using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // S Reverse the first half of the list
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            // slow=slow.next;
            fast = fast.next.next; // Move fast pointer two steps
            ListNode nextNode = slow.next; // Save next node
            slow.next = prev; // Reverse the slow pointer's next reference
            prev = slow; // Move prev to current slow
            slow = nextNode; // Move slow to the next node
        }

        // Step 3: If the list length is odd, move slow one step ahead to skip the middle element
        if (fast != null) { 
            slow = slow.next;
        }

        // Step 4: Compare the reversed first half with the second half
        while (slow != null) {
            if (prev.val != slow.val) {
                return false; // If values don't match, it's not a palindrome
            }
            prev = prev.next; // Move prev to the next node
            slow = slow.next; // Move slow to the next node
        }

        return true; // If all values match, the list is a palindrome
    }
}