package single;


/**
 * 1295. 统计位数为偶数的数字
 * @author ca1m
 */
public class Single_1295 {

	public static void main(String[] args) {
		
		int nums[] = new int[] {12,10,1550,266};
		
		System.out.println(findNumbers(nums));
		
	}
	
	public static int findNumbers(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) { // 遍历每一个 数字
			if(find_1(nums[i])) { // 返回该数字是几位数
				count++;
			}
		}
		return count;
    }
	/**
	 * 迭代 计算 该数字 有几位
	 */
	public static boolean find_1(int n) {
		int time = 0;
		while (n != 0) {
			n = n / 10;
			time++;
		}
		if (time != 0 && time % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 递归 计算 该数字 有几位
	 */
	public static int find_(int n, int time) {
		if (n != 0) {
			n = n / 10;
			time++;
			return find_(n, time);
		} else {
			return time;
		}
	}
}
