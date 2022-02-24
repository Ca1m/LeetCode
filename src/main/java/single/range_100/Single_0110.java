package single.range_100;

import bean.TreeNode;

/**
 * 110. 平衡二叉树
 * @author yancy
 * @version 1.0
 * @since 2022/2/23
 */
public class Single_0110 {


    public static void main(String[] args) {

        TreeNode node001 = new TreeNode(3);
        TreeNode node002 = new TreeNode(9);
        TreeNode node003 = new TreeNode(20);
        TreeNode node004 = new TreeNode(15);
        TreeNode node005 = new TreeNode(7);
        node001.left = node002;
        node001.right = node003;
        node003.left = node004;
        node003.right = node005;


        System.out.println(new Single_0110().isBalanced(node001));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 当 root 做为根节点
        if (Math.abs(calTreeDeep(root.left) - calTreeDeep(root.right)) > 1) {
            return false;
        }
        // 每一个节点作为根节点
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int calTreeDeep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(calTreeDeep(root.left), calTreeDeep(root.right)) + 1;
    }
}







