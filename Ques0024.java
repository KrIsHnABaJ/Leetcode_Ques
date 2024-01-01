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
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next ==null){
            return head;
        }   	
        ListNode prev =null;
        ListNode present =head;
        while(true){
            ListNode last =prev;
            ListNode newend=present;
            ListNode next = present.next;
            ListNode node = present;

            if (node != null) {
                node = node.next;
            }
            if (node == null) {
                break;
            }
            for(int i=0;present!=null&&i<2;i++){
                present.next =prev;
                prev =present;
                present=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }
            newend.next=present;
            if(present==null){
                break;
            }
            prev = newend;
        }
        return head;
    }
}
