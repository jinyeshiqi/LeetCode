/**
 * Created by jinzichen on 2016/12/7.
 *
 * 92. Reverse Linked List II
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head.next == null || m == n) {
            return head;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode preNode = newHead;
        for (int i = 1; i < m; i++) {
            preNode = preNode.next;
        }

        ListNode startNode = preNode.next;
        for (int i = m; i < n; i++) {
            ListNode tempNode = startNode.next;
            startNode.next = tempNode.next;
            tempNode.next = preNode.next;
            preNode.next = tempNode;
        }

        return newHead.next;
    }
}
