/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
*/

class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null) return; // Edge case: Last node can't be deleted this way
        node.val = node.next.val;
        node.next = node.next.next;
    }
}