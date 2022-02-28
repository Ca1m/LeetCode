package single.range_100;

import bean.TreeNode;
import util.TreeNodeUtil;

/**
 * 0235. 二叉搜索树的最近公共祖先
 *
 * @author yancy
 * @version 1.0
 * @data 2022/2/27
 */
public class Single_0235 {

    public static void main(String[] args) {

        Object[] objects01 = new Object[]{6,2,8,0,4,7,9,null,null,3,5};
        Object[] objects02 = new Object[]{6,2,8,0,4,7,9,null,null,3,5};
        TreeNode node01 = new TreeNode(2);
        TreeNode node02 = new TreeNode(8);
        TreeNode root = TreeNodeUtil.arrayToTreeNode(objects02);

        TreeNode node = new Single_0235().lowestCommonAncestor(root, node01, node02);
        System.out.println(node.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val == root.val) {
            return p;
        }
        if (q.val == root.val) {
            return q;
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }
}