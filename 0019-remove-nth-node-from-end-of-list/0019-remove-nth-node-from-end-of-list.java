class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode f = temp;
        ListNode s = temp;

        for(int i = 0;i<=n;i++){
            f = f.next;
        }
        while(f!=null){
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return temp.next;
    }
}