import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jinzichen on 2016/12/14.
 *
 * 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> results = new LinkedList<>();
        Queue<TreeNode> nodes = new LinkedList<>();

        if (root == null) {
            return results;
        }
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int level = nodes.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = nodes.poll();
                list.add(node.val);
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            results.add(0, list);
        }

        return results;
    }
}
