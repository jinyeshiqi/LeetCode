/**
 * Created by jinzichen on 2016/12/18.
 *
 * 203. Remove Linked List Elements
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveElements {
    //Iterative
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            return null;
//        }
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode prevNode = dummyHead;
//        while (prevNode.next != null) {
//            if (prevNode.next.val == val) {
//                prevNode.next = prevNode.next.next;
//            } else {
//                prevNode = prevNode.next;
//            }
//        }
//        return dummyHead.next;
//    }

    //Recursive
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
