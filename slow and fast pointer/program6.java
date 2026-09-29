/*
Code
Testcase
Testcase
Test Result
234. Palindrome Linked List
Easy
Topics
premium lock icon
Companies
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false */


public class program6 {
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head ;

        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast=fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast =head;
        while (slow != null){
              if(fast.val != slow.val) return false ; 

              fast =fast.next;
              slow = slow.next;
        }
        return true ;
        }


    }

