package single.mian;

import bean.TreeNode;

/**
 * mian 0402 最小高度树
 * @Author:   江岩
 * @Date:     2020/11/29 12:51
 * @Version:  1.0
 */
public class Single_mian_0402 {

	public static void main(String[] args) {

		int[] nums = new int[] { -10, -3, 0, 5, 9 };

		sortedArrayToBST(nums);

	}

	public static TreeNode sortedArrayToBST(int[] nums) {

		return sortedArrayToBST(nums, 0, nums.length);
		
	}

	public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {

		if (left == right) {
			return null;
		}
		int mid = left + (right - left)/2;
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = sortedArrayToBST(nums, left, mid);
		root.right = sortedArrayToBST(nums, mid+1, right);

		return root;
	}

}
