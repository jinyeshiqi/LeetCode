/**
 * Created by jinzichen on 2016/12/9.
 *
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nodeI = head;
        ListNode nodeJ = head.next;
        while (nodeJ != null) {
            if (nodeI.val == nodeJ.val) {
                nodeI.next = nodeJ.next;
            } else {
                nodeI = nodeJ;
            }
            nodeJ = nodeJ.next;
        }
        return head;
    }
}
