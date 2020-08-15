package action.reverselist;

/**
 * @author zhaohongxin
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }
        return previous;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
