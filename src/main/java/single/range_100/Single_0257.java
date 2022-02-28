package single.range_100;

import bean.TreeNode;
import util.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 0257. 二叉树的所有路径
 *
 * @author yancy
 * @version 1.0
 * @data 2022/2/27
 */
public class Single_0257 {

    public static void main(String[] args) {

        Object[] objects = new Object[]{1,2,3,null,5};
        TreeNode treeNode = TreeNodeUtil.arrayToTreeNode(objects);

        List<String> list = new Single_0257().binaryTreePaths(treeNode);

        for (String s : list) {
            System.out.println(s);
        }
    }

    // 任意顺序， 通过参数传递的方式，记录所有的信息，直到遍历完成的时候，add
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();
        treePath(root, new StringBuilder(), list);
        return list;
    }

    private static void treePath(TreeNode root, StringBuilder stringBuilder, List<String> list) {
        if (root == null) {
            return ;
        }
        stringBuilder.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(stringBuilder.toString());
        } else {
            treePath(root.left, new StringBuilder(stringBuilder).append("->"), list);
            treePath(root.right, new StringBuilder(stringBuilder).append("->"), list);
        }
    }
}
