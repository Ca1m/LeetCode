package single.range_100;

import bean.TreeNode;
import util.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 0145. 二叉树的后序遍历 : 左右根
 *
 * @author yancy
 * @version 1.0
 * @data 2022/2/27
 */
public class Single_0145 {

    public static void main(String[] args) {

        Object[] objects = new Object[]{1,null,2,3};
        TreeNode root = TreeNodeUtil.arrayToTreeNode(objects);
        List<Integer> list = new Single_0145().postorderTraversal(root);

        for (int i : list) {
            System.out.print(i + ",");
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        return postorder(root, list);
    }

    private static List<Integer> postorder(TreeNode root, List list) {
        if (root == null) {
            return list;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        if (root != null) {
            list.add(root.val);
        }
        return list;
    }
}
