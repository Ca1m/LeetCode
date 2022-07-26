package single.range_100.range_500;

import java.util.Arrays;

/**
 * 561. 数组拆分 1
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/9
 */
public class Single_0561 {

    public static void main(String[] args) {

        int[] nums = {6,2,6,5,1,2};
        System.out.println(new Single_0561().arrayPairSum(nums));

    }


    public int arrayPairSum(int[] nums) {

        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i+2) {
            count += nums[i];
        }
        return count;
    }

}
