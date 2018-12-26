package Remove;

/**
 * Created by RookieWangZhiWei on 2018/10/11.
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode result = removeElements(head.next, val);
        if (head.val == val) {
            return result;
        } else {
            head.next = result;
            return head;
        }
    }
}
