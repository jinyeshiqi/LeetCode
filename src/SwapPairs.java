/**
 * Created by jinzichen on 2016/12/7.
 *
 * 24. Swap Nodes in Pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapPairs {
    //Iterative method
//    public ListNode swapPairs(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode newHead = new ListNode(0);
//        ListNode node = newHead;
//        while (head != null && head.next != null) {
//            ListNode temp = head;
//            node.next = head.next;
//            head = head.next.next;
//            node.next.next = temp;
//            temp.next = head;
//            node = temp;
//        }
//
//        return newHead.next;
//    }
    //Recursive method
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;

        return newHead;
    }
}
