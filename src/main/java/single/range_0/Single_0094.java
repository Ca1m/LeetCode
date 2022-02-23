package single.range_0;


import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 0094  二叉树的中序遍历
 *  前序遍历： 根左右   一般的显示格式
 *  中序遍历： 左根右
 *  后序遍历： 左右根
 */
public class Single_0094 {

    // [1,null,2,3]
    // []
    // [1]
    // [1,2]
    public static void main(String[] args) {
        TreeNode node001 = new TreeNode(1);
        TreeNode node002 = new TreeNode(2);
        TreeNode node003 = new TreeNode(3);
        node001.right = node002;
        node002.left = node003;

        List<Integer> list = new Single_0094().inorderTraversal(node001);
        System.out.print(list.toString());
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return inorderTraversal(root, new ArrayList<>());
    }

    // list.add(root.val) 的位置决定了是什么方式
    // 先做：根左右  中间做： 左右根  最后做： 左根右
    private List<Integer> inorderTraversal(TreeNode root, List<Integer> list){
        if (root.left != null) {
            inorderTraversal(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, list);
        }
        return list;
    }

}
