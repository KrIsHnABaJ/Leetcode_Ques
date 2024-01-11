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
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null||head.next==null){
            return head;
        }
        ListNode present = head;
        ListNode prev = null;
        ListNode next = head.next;
        while(present.next!=null){
            if(present.val!=next.val){
                prev=present;
                present=next;
                if(next!=null){
                    next=next.next;
                }
            }else{
                while(present!=null){
                    next=next.next;
                    if(next==null){
                        if(prev!=null){
                            prev.next=null;
                        }else{
                            return null;
                        }
                        return head;
                    }
                    if(present.val!=next.val){
                        present=next;
                        next=next.next;
                        if(prev!=null){
                            prev.next=present;
                        }else{
                            head=present;
                        }
                        break;
                    }
                }
            }
        }
        return head;
    }
}
