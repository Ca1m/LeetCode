package single.range_600;

/**
 * 643. 子数组最大平均数
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/10
 */
public class Single_0643 {

    public static void main(String[] args) {

        int[] nums = {1,12,33,11,-78,66,9,33,66,-87,99,-11,3};
        System.out.println(new Single_0643().findMaxAverage(nums, 4));

    }


    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        int temp = max;
        for (int i = k; i < nums.length; i++) {
            temp = temp - nums[i - k] + nums[i];
            max = Math.max(temp, max);
        }
        return 1.0 * max / k;
    }
}
