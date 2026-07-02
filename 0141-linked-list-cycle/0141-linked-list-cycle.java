public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode start = head;
        ListNode end = head;

        while(start != null && start.next != null){
            start = start.next.next;
            end = end.next;

            if(start== end){
                return true;
            }
        }
        return false;
    }
}