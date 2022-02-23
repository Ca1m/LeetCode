package single.offer;

import bean.TreeNode;

/**
 * offer 54 二叉搜索树的第k大节点
 * @Author:   江岩
 * @Date:     2020/11/29 12:49
 * @Version:  1.0
 */
public class Single_offer_0054 {

	private int index = 0;
	private int value = 0;
	public static void main(String[] args) {
		
		
		TreeNode root = new TreeNode(5);
		TreeNode node_1 = new TreeNode(3);
		TreeNode node_2 = new TreeNode(6);
		TreeNode node_3 = new TreeNode(2);
		TreeNode node_4 = new TreeNode(4);
		TreeNode node_5 = new TreeNode(1);
		
		root.left = node_1;
		root.right = node_2;
		node_1.left = node_3;
		node_1.right = node_4;
		node_3.left = node_5;
		
		System.out.println(new Single_offer_0054().kthLargest(root, 3));
		
	}

	
	/**
	 * 当 right 节点为空的时候，index++,表示 统计了 root 节点
	 */
	public int kthLargest(TreeNode root, int k) {
		if (root == null) {
			return 0;
		}
		kthLargest(root.right, k);
		index++;
		if (k == index) {
			value = root.val;
		}
		kthLargest(root.left, k);
		return value;
    }
	
}
