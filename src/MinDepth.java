/**
 * Created by jinzichen on 2016/12/15.
 *
 * 111. Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minL = 0, minR = 0;
        if (root.left != null) {
            minL = minDepth(root.left);
        }
        if (root.right != null) {
            minR = minDepth(root.right);
        }
        if (minL == 0 || minR == 0) {
            return minL + minR + 1;
        }
        return Math.min(minL, minR) + 1;
    }
}
