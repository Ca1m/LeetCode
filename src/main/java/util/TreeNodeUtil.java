package util;

import bean.TreeNode;

public class TreeNodeUtil {

    // 数组转 treeNode
    public static TreeNode arrayToTreeNode(Object[] arrays) {
        if (arrays == null) {
            return null;
        }
        TreeNode root = new TreeNode((int)arrays[0]);
        covertTreeNode(root, arrays, 1);
        return root;
    }

    private static void covertTreeNode(TreeNode root, Object[] arrays, int index) {

        if (index >= arrays.length-1 || arrays[index] == null) {
            return ;
        }
        // 左节点
        if (arrays[index] != null) {
            root.left = new TreeNode((int)arrays[index]);
        }
        // 右节点
        if (arrays[index+1] != null) {
            root.right = new TreeNode((int)arrays[index+1]);
        }
        covertTreeNode(root.left, arrays, 2*index+1);
        covertTreeNode(root.right, arrays, 2*(index+1)+1);
    }

    public static void main(String[] args) {

        System.out.println(Math.log(8)/Math.log(2));

        Object[] arrays = new Object[]{3,9,20,null,null,15,7};
        TreeNode root = arrayToTreeNode(arrays);
    }
}
