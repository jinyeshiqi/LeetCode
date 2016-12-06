import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 102. Binary Tree Level Order Traversal
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new LinkedList<>();
        if (root == null) {
            return results;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int levelSize = nodes.size();
            for (int i = 0; i < levelSize; i++) {
                if (nodes.peek().left != null) {
                    nodes.add(nodes.peek().left);
                }
                if (nodes.peek().right != null) {
                    nodes.add(nodes.peek().right);
                }
                level.add(nodes.poll().val);
            }
            results.add(level);
        }

        return results;
    }
}
