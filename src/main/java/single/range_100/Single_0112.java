package single.range_100;

import bean.TreeNode;
import util.TreeNodeUtil;

/**
 * 112. 路径之和
 *
 * @author yancy
 * @version 1.0
 * @since 2022/2/26
 */
public class Single_0112 {

    public static void main(String[] args) {
        Object[] obj = new Object[]{5,4,8,11,null,13,4,7,2,null,null,null,1};
        Object[] obj001 = new Object[]{1,2,3};
        Object[] obj002 = new Object[]{0};

        TreeNode root = TreeNodeUtil.arrayToTreeNode(obj002);
        boolean flag = new Single_0112().hasPathSum(root, 0);

        System.out.println(flag);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }
        return hasPathSum(root.left, targetSum -= root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
