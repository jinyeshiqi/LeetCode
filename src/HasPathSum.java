/**
 * Created by jinzichen on 2016/12/7.
 *
 * 112. Path Sum
 * https://leetcode.com/problems/path-sum/
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }

        boolean lResult = hasPathSum(root.left, sum - root.val);
        boolean rResult = hasPathSum(root.right, sum - root.val);

        return lResult || rResult;
    }
}
