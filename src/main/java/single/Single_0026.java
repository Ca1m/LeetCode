package single;

public class Single_0026 {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 3, 3, 4 };

		for (int i = 0; i < removeDuplicates(nums); i++) {
			System.out.println(nums[i]);
		}

	}

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
