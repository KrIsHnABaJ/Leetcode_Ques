class Solution {
    public void reorderList(ListNode head) {
        if(head== null || head.next ==null){
            return;
        }
        ListNode mid =middleNode(head);
        ListNode s =head;
        ListNode x =reverseList(mid);
        while(s!=null &&x!=null){
            ListNode temp =s.next;
            s.next=x;
            s=temp;
            temp=x.next;
            x.next=s;
            x=temp;
        }
        if(s!=null){
            s.next=null;
        }
    }

     //reverse list
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev =null;
        ListNode present = head;
        ListNode next = present.next;
        while(present != null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }

    //middle
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
