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
    public ListNode mergeKLists(ListNode[] lists) {        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode result = new ListNode();
        ListNode resultPre = result;
        // first add the top item from each LL to the heap
        for (ListNode list : lists) {
            if (list != null) {
                heap.add(list);
            }
        }

        // while heap size > 0
        while (!heap.isEmpty()) {
            // poll the heap = smallestNode
            ListNode smallestNode = heap.poll();
            // add the smallestNode to the result through copy
            result.next = new ListNode(smallestNode.val);
            result = result.next;
            // move the smallestNode pointer by one
            smallestNode = smallestNode.next;
            // add the smallestNode to the heap
            if (smallestNode != null) {
                heap.add(smallestNode);
            }
        }
        return resultPre.next;}
}
