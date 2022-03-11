package single.range_500;

import java.util.Arrays;

/**
 * 645. 错误的集合
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/10
 */
public class Single_0645 {

    public static void main(String[] args) {

        int[] nums = {1,5,3,2,2,7,6,4,8,9};
        int[] nums2 = new Single_0645().findErrorNums(nums);
        for (int i : nums2) {
            System.out.print(i + ",");
        }
    }

    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length) {
                if (nums[i] == nums[i+1]) {
                    res[0] = nums[i];
                }
                if (nums[i+1] - nums[i] == 2) {
                    res[1] = nums[i+1] - 1;
                }
            }
        }
        if (res[1] == 0) {
            res[1] = nums[0] == 1 ? nums[nums.length-1]+1 : 1;
        }
        return res;
    }
}
