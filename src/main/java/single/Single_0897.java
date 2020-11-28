package single;

import bean.TreeNode;

/**
 * 897. 递增顺序查找树
 * @author ca1m
 */
public class Single_0897 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode increasingBST(TreeNode root) {

		if (root == null) {
			return null;
		}
		TreeNode leftNode = increasingBST(root.left);
		TreeNode rightNode = increasingBST(root.right);
		
		if (leftNode != null) {
			TreeNode currNode = leftNode;
			while (currNode != null && currNode.right != null) {
				currNode = currNode.right;
			}
			currNode.right = root;
		}
		root.left = null;
		root.right = rightNode;
		
		return leftNode == null ? root : leftNode;
    }
	
}



