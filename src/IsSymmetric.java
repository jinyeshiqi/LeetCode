/**
 * Created by jinzichen on 2016/12/9.
 *
 * 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/
 */
public class IsSymmetric {
    //Recursive solution
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    //Iterative solution
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        if (!isSymmetricNode(queue, root.left, root.right)) {
//            return false;
//        }
//
//        while (!queue.isEmpty()) {
//            TreeNode left = queue.poll();
//            TreeNode right = queue.poll();
//            if (left.val != right.val) {
//                return false;
//            }
//            if (!isSymmetricNode(queue, left.left, right.right)) {
//                return false;
//            }
//            if (!isSymmetricNode(queue, right.left, left.right)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean isSymmetricNode(Queue<TreeNode> queue, TreeNode a, TreeNode b) {
//        if (a != null) {
//            if (b == null) {
//                return false;
//            }
//            queue.offer(a);
//            queue.offer(b);
//        } else {
//            if (b != null) {
//                return false;
//            }
//        }
//        return true;
//    }
}
