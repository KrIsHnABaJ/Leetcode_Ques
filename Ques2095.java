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
        if(head==null || head.next==null){
            return null;
        }
        ListNode present = head;
        ListNode prev =null;
        ListNode next = present.next;
        int length=1;
        while(present.next!=null){
            present = present.next;
            length++;
        }
        present = head;
        int size = (length/2);
        for (int i = 0; i < size; i++) {
            prev=present;
            present=next;
            next =next.next;
        }
        prev.next = next;
        return head;
    }
}
