package single.range_100;

import bean.TreeNode;
import util.TreeNodeUtil;

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

    public List<String> binaryTreePaths(TreeNode root) {



        return null;
    }

    private static List treePath(TreeNode root) {


        return null;

    }

}
