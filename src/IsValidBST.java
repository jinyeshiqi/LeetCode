import java.util.Stack;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class IsValidBST {
    //Recursive method
//    public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    public boolean isValidBST(TreeNode root, long min, long max) {
//        if (root == null) {
//            return true;
//        }
//
//        if (root.val <= min || root.val >= max) {
//            return false;
//        }
//
//        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
//    }

    //Inorder traversal method
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode prevNode = null;

        while (root != null || !nodes.isEmpty()) {
            if (root != null) {
                nodes.push(root);
                root = root.left;
            } else {
                root = nodes.pop();
                if (prevNode != null && root.val <= prevNode.val) {
                    return false;
                }
                prevNode = root;
                root = root.right;
            }
        }

        return true;
    }
}
