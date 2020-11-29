package single;

import bean.TreeNode;

/**
 * 226. 翻转二叉树
 * @Author:   江岩
 * @Date:     2020/11/29 12:40
 * @Version:  1.0
 */
public class Single_0226 {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		TreeNode node_1 = new TreeNode(2);
		TreeNode node_2 = new TreeNode(7);
		TreeNode node_3 = new TreeNode(1);
		TreeNode node_4 = new TreeNode(3);
		TreeNode node_5 = new TreeNode(6);
		TreeNode node_6 = new TreeNode(9);
		
		
		root.left = node_1;
		root.right = node_2;
		node_1.left = node_3;
		node_1.right = node_4;
		node_2.left = node_5;
		node_2.right = node_6;
		
		
		invertTree(root);
	}
	
	
	public static TreeNode invertTree(TreeNode root) {

		if (root == null) {
			return null;
		}
		TreeNode tempNode = invertTree(root.left);
		root.left = invertTree(root.right);
		root.right = tempNode;
		
		return root;
    }
	

}
