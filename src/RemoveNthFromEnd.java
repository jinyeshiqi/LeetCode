/**
 * Created by jinzichen on 2016/12/9.
 *
 * 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode nodeI = dummyHead;
        ListNode nodeJ = dummyHead;
        while (nodeJ.next != null) {
            if (n > 0) {
                nodeJ = nodeJ.next;
                n--;
            } else {
                nodeI = nodeI.next;
                nodeJ = nodeJ.next;
            }
        }
        nodeI.next = nodeI.next.next;
        return dummyHead.next;
    }
}
