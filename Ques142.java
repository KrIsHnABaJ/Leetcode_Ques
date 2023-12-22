/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length =0;
        ListNode Fast = head;
        ListNode Slow =head;
        while(Fast!=null && Fast.next!=null){
            Fast = Fast.next.next;
            Slow =Slow.next;
            if(Fast==Slow){
                length =lenCycle(Slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode f =head;
        ListNode s =head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    public int lenCycle(ListNode head) {
        ListNode Fast = head;
        ListNode Slow =head;
        while(Fast!=null&Fast.next!=null){
            Fast = Fast.next.next;
            Slow =Slow.next;
            if(Fast==Slow){
                ListNode temp = Slow;
                int length =0;
                do{
                    temp =temp.next;
                    length++;
                }while(temp!=Slow);
                return length;
            }
        }
        return 0;
    }
}
