package single.range_500;

/**
 * 674. 最长的连续递增序列
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/12
 */
public class Single_0674 {

    public static void main(String[] args) {

        int[] nums = {1,3,5,7};
        System.out.println(new Single_0674().findLengthOfLCIS(nums));

    }

    public int findLengthOfLCIS(int[] nums) {

        int max = 0, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }

}
