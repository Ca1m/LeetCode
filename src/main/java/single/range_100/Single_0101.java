package single.range_100;


import bean.TreeNode;

/**
 * 101 对称二叉树
 */
public class Single_0101 {

    public static void main(String[] args) {
        TreeNode node001 = new TreeNode(1);
        TreeNode node002 = new TreeNode(2);
        TreeNode node003 = new TreeNode(3);
        TreeNode node004 = new TreeNode(4);
        TreeNode node005 = new TreeNode(2);
        TreeNode node006 = new TreeNode(4);
        TreeNode node007 = new TreeNode(3);
        node001.left = node002;
        node001.right = node005;
        node002.left = node003;
        node002.right = node004;
        node005.left = node006;
        node005.right = node007;

        System.out.println(new Single_0101().isSymmetric(node001));
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }
        // 最终，迭代只有一个结果，且是最终的结果，每次 return 都是一次迭代的结束
        return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
    }
}
