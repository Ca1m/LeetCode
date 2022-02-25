package single.range_100;


import bean.TreeNode;
import sun.reflect.generics.tree.Tree;
import util.TreeNodeUtil;

/**
 * 111. 二叉树的最小深度
 */
public class Single_0111 {

    public static void main(String[] args) {

        Object[] arrays = new Object[]{2,null,3,null,4,null,5,null,6};
        TreeNode root = TreeNodeUtil.arrayToTreeNode(arrays);

        System.out.println(new Single_0111().minDepth(root));

    }

    // 计算 左右子树的深度，取最小的值
    public int minDepth(TreeNode root) {

        if (root == null){
            return 0;
        }
        if (root.left == null) {
            return minDep(root.right);
        }
        if (root.right == null) {
            return minDep(root.left);
        }
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }

    private int minDep(TreeNode root) {


        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }


}
