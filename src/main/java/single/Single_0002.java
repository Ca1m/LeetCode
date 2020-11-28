package single;

import bean.TreeNode;

/**
 * LeetCode 27题： 二叉树的镜像
 * 
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 * 
 * @author ca1m
 */
public class Single_0002 {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		TreeNode node_1 = new TreeNode(2);
		TreeNode node_2 = new TreeNode(7);
		TreeNode node_3 = new TreeNode(1);
		TreeNode node_4 = new TreeNode(3);
		TreeNode node_5 = new TreeNode(6);
		//TreeNode node_6 = new TreeNode(9);

		root.left = node_1;
		root.right = node_2;
		node_1.left = node_3;
		node_1.right = node_4;
		node_2.left = node_5;
		//node_2.right = node_6;
		
		root = Single_0002.mirrorTree(root);
		
		System.out.println(root.val + ",");
		printTree(root);
	}

	public static TreeNode mirrorTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		TreeNode tempNode = mirrorTree(root.left);
		root.left = mirrorTree(root.right);
		root.right = tempNode;
		
		return root;
	}
	
	/**
	 * 输出 翻转的结果，头结点特殊输出
	 * @param root
	 */
	public static void printTree(TreeNode root) {
		if (root != null) {
			if (root.left != null || root.right != null) {
				if (root.left == null) {
					System.out.println(null + ",");
				} else {
					System.out.println(root.left.val + ",");
				}
				if (root.right == null) {
					System.out.println(null + ",");
				} else {
					System.out.println(root.right.val + ",");
				}
				printTree(root.left);
				printTree(root.right);
			}
		}
	}
}




