package single;

// 1480. 一维数组的动态和
public class Single_1480 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		int[] is = runningSum(nums);

		for (int i : is) {
			System.out.print(i + ",");
		}
	}

	public static int[] runningSum(int[] nums) {
		if (nums == null) {
			return nums;
		}
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
		return nums;
	}

}
