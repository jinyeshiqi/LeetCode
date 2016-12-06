/**
 * Created by jinzichen on 2016/12/7.
 *
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseList {
    //Iterative method
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode prevNode = null;
//        ListNode currNode = head;
//        while (currNode != null) {
//            ListNode tempNode = currNode.next;
//            currNode.next = prevNode;
//            prevNode = currNode;
//            currNode = tempNode;
//        }
//
//        return prevNode;
//    }
    //Recursive method
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
