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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode head = result; //pointer to the head

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode next = new ListNode(list1.val);
                list1 = list1.next;
                result.next = next;   // set the next node
                result = result.next; // move to that next node
            } else {
                ListNode next = new ListNode(list2.val);
                list2 = list2.next;
                result.next = next;   // set the next node
                result = result.next; // move to that next node
            }
        }
        while (list1 != null) {
            ListNode next = new ListNode(list1.val);
            list1 = list1.next;
            result.next = next;   // set the next node
            result = result.next; // move to that next node

        }
        while (list2 != null) {
            ListNode next = new ListNode(list2.val);
            list2 = list2.next;
            result.next = next;   // set the next node
            result = result.next; // move to that next node
        }
        return head.next;
    }
}