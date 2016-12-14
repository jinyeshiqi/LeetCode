/**
 * Created by jinzichen on 2016/12/15.
 *
 * 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return heightDiff(root) != -1;
    }

    private int heightDiff(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int heightL = heightDiff(node.left);
        if (heightL == -1) {
            return -1;
        }
        int heightR = heightDiff(node.right);
        if (heightR == -1) {
            return -1;
        }
        int diff = heightL - heightR;
        if (diff < -1 || diff > 1) {
            return -1;
        }
        return Math.max(heightL, heightR) + 1;
    }
}
