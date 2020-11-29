package single;

import bean.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 * @Author:   江岩
 * @Date:     2020/11/29 12:39
 * @Version:  1.0
 */
public class Single_0108 {

	private static TreeNode root = null;
	public static void main(String[] args) {
		
	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayBST_(nums, 0, nums.length - 1);
    }
	
	
	public static TreeNode sortedArrayBST_(int[] nums, int l, int r) {
		if (l > r) {
			return null;
		} else {
			int mid = l + (r - l)/2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = sortedArrayBST_(nums, l, mid-1);
			root.right = sortedArrayBST_(nums, mid+1, r);
			return root;
		}
	}
	
}





