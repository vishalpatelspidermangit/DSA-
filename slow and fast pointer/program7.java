/* 143. Reorder List
Medium
Topics
premium lock icon
Companies
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints: */
public class program7 {
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode second = reverseList(slow);
        ListNode first = head;

        // 3. Merge alternately
        while (second.next != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    }
}
