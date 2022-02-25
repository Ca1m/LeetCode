package single.range_1000;

/**
 * 1389. 按既定顺序创建目标数组
 * @Author:   江岩
 * @Date:     2020/11/29 12:45
 * @Version:  1.0
 */
public class Single_1389 {

	public static void main(String[] args) {
		

		int[] nums = new int[] {0,1,2,3,4};
		int[] index = new int[] {0,1,2,2,1};
		
		int[] arr = createTargetArray(nums, index);
		
		System.out.println(arr.toString());
		for (int i : arr) {
			System.out.print(i + ",");
		}
		
	}

	public static int[] createTargetArray(int[] nums, int[] index) {

		int[] arr = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (index[j] >= index[i]) {
					index[j]++;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			arr[index[i]] = nums[i];
		}
		return arr;
	}
	
	
	
	public static int[] createTargetArray_(int[] nums, int[] index) {

		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 101;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			j = index[i];
			while (arr[j] != 101 && j+1 < nums.length) {
				j = j + 1;
			}
			while (j > index[i]) {
				arr[j] =  arr[j-1];
				j--;
			}
			if (j <= index[i]) {
				arr[j] = nums[i];
			}
			
		}
		return arr;
    }
	
}
