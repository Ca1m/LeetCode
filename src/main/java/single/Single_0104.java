package single;

import bean.TreeNode;

/**
 * 104. 二叉树的最大深度
 * @Description:  (补充描述)
 * @Author:   江岩
 * @Date:     2020/11/29 12:39
 * @Version:  1.0
 */
public class Single_0104 {

	private int tempMax = 0;
	private int maxD = 0;
	public static void main(String[] args) {
		

		TreeNode root = new TreeNode(3);
		TreeNode node_1 = new TreeNode(9);
		TreeNode node_2 = new TreeNode(20);
		TreeNode node_3 = new TreeNode(15);
		TreeNode node_4 = new TreeNode(7);
		
		root.left = node_1;
		root.right = node_2;
		node_2.left = node_3;
		node_2.right = node_4;
		
		System.out.println(new Single_0104().maxDepth(root));
		
	}
	
	
	public int maxDepth(TreeNode root) {
		return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}	
    

}
