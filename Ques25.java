class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
}
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null || head.next ==null || k==1){
            return head;
        }   	
        ListNode prev =null;
        ListNode present =head;
        while(true){
            ListNode last =prev;
            ListNode newend=present;
            ListNode next = present.next;
            ListNode node = present;

            for (int i = 0; i < k-1 && node != null; i++) {
                node = node.next;
            }
            if (node == null) {
                break;
            }
            for(int i=0;present!=null&&i<k;i++){
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
