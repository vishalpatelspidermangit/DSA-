/*
 
Code
Testcase
Testcase
Test Result
876. Middle of the Linked List
Easy
Topics
premium lock icon
Companies
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2: */


public class program5 {
     public ListNode middleNode(ListNode head) {
        ListNode slow =head ;
        ListNode fast = head ;
      while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;

      }
      return slow;
    }
}
