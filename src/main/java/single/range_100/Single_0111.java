package single.range_100;


import bean.TreeNode;
import util.TreeNodeUtil;

/**
 * 111. 二叉树的最小深度
 */
public class Single_0111 {

    public static void main(String[] args) {

        TreeNode node001 = new TreeNode(2);
        TreeNode node002 = new TreeNode(3);
        TreeNode node003 = new TreeNode(4);
        TreeNode node004 = new TreeNode(5);
        TreeNode node005 = new TreeNode(6);

        node001.right = node002;
        node002.right = node003;
        node003.right = node004;
        node004.right = node005;

        Object[] arrays = new Object[]{2,null,3,null,4,null,5,null,6};
        TreeNode root = TreeNodeUtil.arrayToTreeNode(arrays);

        System.out.println(new Single_0111().minDepth(root));
    }
    // 计算 左右子树的深度，取最小的值
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return minDep(root)+1;
    }
    private int minDep(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        if (root.left == null) {
            return minDep(root.right)+1;
        }
        if (root.right == null) {
            return minDep(root.left)+1;
        }
        return Math.min(minDep(root.left), minDep(root.right))+1;
    }


}
