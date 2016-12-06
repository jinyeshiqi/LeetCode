/**
 * Created by jinzichen on 2016/12/7.
 *
 * 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class HasCycle {
    //Two-pointer
    public boolean hasCycle(ListNode head){
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (fastNode != null && fastNode.next != null) {
            if (slowNode == fastNode) {
                return true;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return false;
    }
}
