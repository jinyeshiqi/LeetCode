/**
 * Created by jinzichen on 2016/12/7.
 *
 * 237. Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        //Single linked list
        //Copy the next node to the target
        node.val = node.next.val;
        //Delete the next node
        node.next = node.next.next;
    }
}
