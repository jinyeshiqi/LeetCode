import java.util.LinkedList;
import java.util.List;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 257. Binary Tree Paths
 * https://leetcode.com/problems/binary-tree-paths/
 */

//DFS and Recursive method
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> results = new LinkedList<>();
        if (root == null) {
            return results;
        }

        if (root.left == null && root.right == null) {
            results.add(root.val + "");
            return results;
        }

        for (String str : binaryTreePaths(root.left)) {
            results.add(root.val + "->" + str);
        }
        for (String str : binaryTreePaths(root.right)) {
            results.add(root.val + "->" + str);
        }

        return results;
    }
}

//DFS and Recursive method
//public class BinaryTreePaths {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> results = new LinkedList<>();
//        if (root == null) {
//            return results;
//        }
//
//        findDFSPaths(root, results, new StringBuilder());
//
//        return results;
//    }
//
//    private void findDFSPaths(TreeNode root, List<String> results, StringBuilder sb) {
//        int len = sb.length();
//
//        if (root.left == null && root.right == null) {
//            sb.append(root.val);
//            results.add(sb.toString());
//            sb.setLength(len);
//        }
//        if (root.left != null) {
//            sb.append(root.val + "->");
//            findDFSPaths(root.left, results, sb);
//            sb.setLength(len);
//        }
//        if (root.right != null) {
//            sb.append(root.val + "->");
//            findDFSPaths(root.right, results, sb);
//            sb.setLength(len);
//        }
//    }
//}

//DFS and Iterative method
//public class BinaryTreePaths {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> results = new LinkedList<>();
//        if (root == null) {
//            return results;
//        }
//
//        Stack<TreeNode> nodes = new Stack<>();
//        Stack<String> paths = new Stack<>();
//        nodes.push(root);
//        paths.push(root.val + "");
//
//        while (!nodes.isEmpty()) {
//            TreeNode treeNode = nodes.pop();
//            String path = paths.pop();
//            if (treeNode.left == null && treeNode.right == null) {
//                results.add(path);
//            }
//            if (treeNode.right != null) {
//                nodes.push(treeNode.right);
//                paths.push(path + "->" + treeNode.right.val);
//            }
//            if (treeNode.left != null) {
//                nodes.push(treeNode.left);
//                paths.push(path + "->" + treeNode.left.val);
//            }
//        }
//
//        return results;
//    }
//}

//BFS and Iterative method
//public class BinaryTreePaths {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> results = new LinkedList<>();
//        if (root == null) {
//            return results;
//        }
//
//        Queue<TreeNode> nodes = new LinkedList<>();
//        Queue<String> paths = new LinkedList<>();
//        nodes.add(root);
//        paths.add(root.val + "");
//
//        while (!nodes.isEmpty()) {
//            TreeNode treeNode = nodes.poll();
//            String path = paths.poll();
//            if (treeNode.left == null && treeNode.right == null) {
//                results.add(path);
//            }
//            if (treeNode.left != null) {
//                nodes.add(treeNode.left);
//                paths.add(path + "->" + treeNode.left.val);
//            }
//            if (treeNode.right != null) {
//                nodes.add(treeNode.right);
//                paths.add(path + "->" + treeNode.right.val);
//            }
//        }
//
//        return results;
//    }
//}