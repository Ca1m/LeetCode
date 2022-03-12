package single.range_400;


import bean.TreeNode;
import util.TreeNodeUtil;

/**
 * 0404. 左叶子之和
 *
 * @since 2022/02/28 11:03
 */
public class Single_0404 {


    public static void main(String[] args) {

        Object[] objects = new Object[]{3,9,20,null,null,15,7};
        Object[] objects02 = new Object[]{1};
        TreeNode root = TreeNodeUtil.arrayToTreeNode(objects);
        int i = new Single_0404().sumOfLeftLeaves(root);
        System.out.println(i);
    }
    // 遍历得到 所有的左叶子的和
    // 左叶子 ： 没有子节点，且是其他节点的左节点
    // 截至条件： 找到左叶子， add
    // 遍历整个树，第一个遍历停止条件是 找到子叶子，第二个遍历条件是 遍历完成
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res = root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
    }

}
