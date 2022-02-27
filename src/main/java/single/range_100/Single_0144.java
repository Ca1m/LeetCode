package single.range_100;

import bean.TreeNode;
import util.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 0144. 二叉树的前序遍历
 *   根左右
 * @author yancy
 * @version 1.0
 * @data 2022/2/27
 */
public class Single_0144 {

    public static void main(String[] args) {

        Object[] objects = new Object[]{1,null,2};

        TreeNode root = TreeNodeUtil.arrayToTreeNode(objects);

        List<Integer> list = new Single_0144().preorderTraversal(root);
        for (Integer i : list) {
            System.out.print(i + ",");
        }

    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
       return preorder(root, list);
    }

    private static List<Integer> preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        if (root != null) {
            list.add(root.val);
        }
        preorder(root.left, list);
        preorder(root.right, list);
        return list;
    }
}
