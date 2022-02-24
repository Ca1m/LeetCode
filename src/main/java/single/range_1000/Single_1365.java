package single.range_1000;

/**
 * 1365. 有多少小于当前数字的数字
 * @Author:   江岩
 * @Date:     2020/11/29 12:45
 * @Version:  1.0
 */
public class Single_1365 {

	public static void main(String[] args) {
		
	}
	/**
	 * 桶  
	 * @param nums
	 * @return
	 */
	public int[] smallerNumbersThanCurrent(int[] nums) {

		// 存入 桶中
		int[] bucket = new int[101];
		for (int i : nums) {
			bucket[i]++; //  0 1 2 1 0 0 0 0 1
		}
		// 处理，累加
		for (int i = 1; i < bucket.length; i++) {
			bucket[i] += bucket[i-1]; // 0 1 3 4 4 4 4 4 5
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] > 0 ? bucket[nums[i]-1] : 0; // 4 0 1 1 3
		}
		return nums;
    }
	
	/**
	 * 常规  18ms  40MB
	 * @param nums
	 * @return
	 */
	public int[] smallerNumbersThanCurrent_1(int[] nums) {

		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int index = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					index++;
				}
			}
			temp[i] = index;
		}
		return temp;
    }

}
