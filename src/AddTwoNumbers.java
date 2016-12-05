/**
 * Created by jinzichen on 2016/12/6.
 *
 * 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tempNode = dummyHead;
        ListNode p = l1, q = l2;
        int flag = 0;

        while (p != null || q != null) {
            int n1 = 0, n2 = 0, sum = 0;
            if (p != null) {
                n1 = p.val;
                p = p.next;
            }
            if (q != null) {
                n2 = q.val;
                q = q.next;
            }
            sum = n1 + n2 + flag;
            flag = sum / 10;
            tempNode.next = new ListNode(sum % 10);
            tempNode = tempNode.next;
        }
        if (flag > 0) {
            tempNode.next = new ListNode(flag);
        }

        return dummyHead.next;
    }
}
