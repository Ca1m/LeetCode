package single.range_1000;

import java.util.ArrayList;
import java.util.List;

/**
 * 1331. 解压缩编码列表
 * @Author:   江岩
 * @Date:     2020/11/29 12:45
 * @Version:  1.0
 */
public class Single_1313 {

	public static void main(String[] args) {
		

		int[] nums = new int[] {4, 39,2, 3};
		
		int[] val = decompressRLElist(nums);
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
		
	}
	
	/**
	 * List   11ms  40.6MB
	 * @param nums
	 * @return
	 */
	public static int[] decompressRLElist(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i+=2) {
			while (nums[i] > 0) {
				list.add(nums[i+1]);
				nums[i]--;
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	
	/**
	 * 易读   2ms  40.3MB
	 * @param nums
	 * @return
	 */
	public static int[] decompressRLElist_2(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		int len = 0;
		for (int i = 0; i < nums.length; i+=2) {
			len += nums[i];
		}
		int index = 0;
		int[] val = new int[len];
		for (int i = 0; i < nums.length; i+=2) {
			while (nums[i] > 0) {
				val[index] = nums[i+1];
				nums[i]--;
				index++;
			}
		}
		return val;
    }
	
	/**
	 * 字符串  26ms  40.6MB
	 * @param nums
	 * @return
	 */
	public static int[] decompressRLElist_1(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i]; j++) {
				sb.append(nums[i+1]+",");
			}
			i++;
		}
		String[] ss = sb.toString().split(",");
		int[] val = new int[ss.length];
		for (int i = 0; i < ss.length; i++) {
			val[i] = Integer.valueOf(ss[i]);
		}
		return val;
    }

}
