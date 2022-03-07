package single.range_100;

import java.util.Arrays;

/**
 * 268. 丢失的数字
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/6
 */
public class Single_0268 {

    public static void main(String[] args) {

        int[] nums = new int[]{2,0,1};
        int i = new Single_0268().missingNumber001(nums);
        System.out.println(i);
    }

    public int missingNumber(int[] nums) {
        int sum = ((nums.length+1)*(nums.length))/2;
        for (int i : nums) {
            sum = sum - i;
        }
        return sum;
    }

    public int missingNumber001(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return n;
    }
}
