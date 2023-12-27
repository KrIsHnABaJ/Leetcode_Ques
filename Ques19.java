public class Ques19 {
    static ListNode head;
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||n==0){
            return head;
        }
        ListNode present = head;
        ListNode prev =null;
        ListNode next = present.next;
        int length=1;
        while(present.next!=null){
            present = present.next;
            length++;
        }
        int size = length-n;
        if(size==0&&length==1){
            return null;
        }
        if(size==0){
            head=head.next;
            return head;
        }
        ListNode newhead = head;
        for (int i = 0; i < size; i++) {
            prev=newhead;
            newhead=next;
            next =next.next;
        }
        prev.next =next;
        return head;
    }
}
