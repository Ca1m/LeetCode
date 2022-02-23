package single.range_100;


import bean.TreeNode;

/**
 * 100. 相同的树
 * 结构相同，内容相同
 */
public class Single_0100 {


    public static void main(String[] args) {
        TreeNode node001 = new TreeNode(1);
        TreeNode node002 = new TreeNode(1);
        TreeNode node003 = new TreeNode(2);
        node001.left = node003;
        node001.right = node002;

        TreeNode node011 = new TreeNode(1);
        TreeNode node012 = new TreeNode(1);
        TreeNode node013 = new TreeNode(2);
        node011.left = node012;
        node011.right = node013;

        boolean flag = new Single_0100().isSameTree(node001, node011);
        System.out.println(flag);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
