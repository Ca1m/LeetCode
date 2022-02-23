package single.range_100;

/**
 * 1470. 重新排列数组
 * @Author:   江岩
 * @Date:     2020/11/29 12:46
 * @Version:  1.0
 */
public class Single_1470 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7};
		int[] is = shuffle_1(nums, 3);
		for (int i : is) {
			System.out.print(i +",");
		}
	}
	// 空间复杂度  O(1)    时间复杂度  n
	public static int[] shuffle(int[] nums, int n) {
		if (nums == null) {
			return nums;
		}
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while(nums[i] >= 0) {
				if (j < n) {
					j = j * 2;
					swap(nums, i, j);
				} else {
					j = (j - n) * 2 + 1;
					swap(nums, i, j);
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = -nums[i];
		}
		return nums;
    }
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = -temp;
	}
	
	// 空间复杂度 2n  时间复杂度   2n 
	public static int[] shuffle_1(int[] nums, int n) {
		int[] nums_ = new int[2 * n];
		for (int i = 0; i < nums.length; i++) {
			if (i < n) {
				nums_[i * 2] = nums[i];
			} else {
				nums_[(i - n) * 2 + 1] = nums[i];
			}
		}
		return nums_;
    }
}


