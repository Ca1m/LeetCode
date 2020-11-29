package single;

import bean.TreeNode;

/**
 * offer 55-01 二叉树的深度
 * @Author:   江岩
 * @Date:     2020/11/29 12:49
 * @Version:  1.0
 */
public class Single_offer_0055_1 {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		TreeNode node_1 = new TreeNode(9);
		TreeNode node_2 = new TreeNode(20);
		
		TreeNode node_5 = new TreeNode(15);
		TreeNode node_6 = new TreeNode(7);
		
		root.left = node_1;
		root.right = node_2;
		node_2.left = node_5;
		node_2.right = node_6;
		
		System.out.println(maxDepth(root));
		
	}

	public static int maxDepth(TreeNode root) {

		return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		
	}

	public static int treeMaxDepth(TreeNode root, int treeMaxInt, int maxDepth) {
		if (root == null) {
			if (treeMaxInt > maxDepth) {
				maxDepth = treeMaxInt;
			}
			treeMaxInt = 0;
			return maxDepth;
		} else {
			treeMaxInt++;
			maxDepth = treeMaxDepth(root.left, treeMaxInt, maxDepth);
			maxDepth = treeMaxDepth(root.right, treeMaxInt, maxDepth);
		}
		return maxDepth;
	}

}
