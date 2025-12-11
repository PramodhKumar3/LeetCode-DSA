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
    public ListNode sortList(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        Collections.sort(list);
        ListNode start = null;
        ListNode end = null;
        for(int i : list){
            ListNode newNode = new ListNode(i);
            if(start == null){
                start = newNode;
                end = newNode;
            } else{
                end.next = newNode;
                end = newNode;
            }
        }
        return start;
    }
}