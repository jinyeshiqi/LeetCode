/**
 * Created by jinzichen on 2016/12/7.
 *
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists {
    //Iterative method
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//
//        ListNode head = new ListNode(0);
//        ListNode temp = head;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                temp.next = l1;
//                l1 = l1.next;
//            } else {
//                temp.next = l2;
//                l2 = l2.next;
//            }
//            temp = temp.next;
//        }
//
//        if (l1 == null) {
//            temp.next = l2;
//        } else {
//            temp.next = l1;
//        }
//
//        return head.next;
//    }
    //Recursive method
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }

        return head;
    }
}
