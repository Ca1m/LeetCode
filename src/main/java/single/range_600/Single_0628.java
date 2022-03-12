package single.range_600;

import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 * @author yancy
 * @version 1.0
 * @date 2022/3/10 17:59
 */
public class Single_0628 {

    public static void main(String[] args) {

        int[] nums = {1,0,100};
        System.out.println(new Single_0628().maximumProduct(nums));

    }

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1] * nums[len-1], nums[len-3] * nums[len-2] * nums[len-1]);
    }

}
