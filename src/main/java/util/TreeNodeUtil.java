package util;

import apple.laf.JRSUIUtils;
import bean.TreeNode;


//
public class TreeNodeUtil {

    // 数组转 treeNode
    public static TreeNode arrayToTreeNode(Object[] arrays) {
        if (arrays == null) {
            return null;
        }
        if (arrays.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode((int)arrays[0]);
        covertTreeNode(new Object[]{root}, arrays, 1);
        return root;
    }
    // 逐层遍历
    // 第n层的 节点对象，只有 null 和 node 两种
    // index  第 n+1 层的第一个节点角标
    // newIndex
    private static void covertTreeNode(Object[] treeNodes, Object[] arrays, int index) {

        if (index > arrays.length) {
            return ;
        }
        Object[] newObj = new Object[treeNodes.length*2];
        int newIndex = 0;
        for (Object obj : treeNodes) {
            if (index > arrays.length-1) {return ;}
            if (obj != null) {
                TreeNode treeNode = (TreeNode)obj;
                if (arrays[index] != null) {
                    treeNode.left = new TreeNode((int)arrays[index]);
                    newObj[newIndex] = treeNode.left;
                } else {
                    newObj[newIndex] = null;
                }
                newIndex++;
                index++;
                if (index > arrays.length-1) {return ;}
                if (arrays[index] != null) {
                    treeNode.right = new TreeNode((int)arrays[index]);
                    newObj[newIndex] = treeNode.right;
                } else {
                    newObj[newIndex] = null;
                }
                newIndex++;
                index++;
            }
        }
        Object[] objTemp = new Object[newIndex];
        for (int i = 0; i < newIndex; i++) {
            objTemp[i] = newObj[i];
        }
        covertTreeNode(objTemp, arrays, index);
    }

    public static void main(String[] args) {

        System.out.println(Math.log(8)/Math.log(2));

        Object[] arrays = new Object[]{3,9,20,null,null,15,7};
        // Object[] arrays = new Object[]{2,null,3,null,4,null,5,null,6};
        Object[] objects = new Object[]{6,2,8,0,4,7,9,null,null,3,5};

        TreeNode root = arrayToTreeNode(objects);
        printTreeNode(root);
        System.out.println("\nend");
    }

    private static void printTreeNode(TreeNode root) {

        if (root == null) {
            System.out.print("null"+",");
            return ;
        } else {
            System.out.print(root.val+",");
        }
        if (root.left == null && root.right == null) {
            return;
        }
        printTreeNode(root.left);
        printTreeNode(root.right);
    }
}
