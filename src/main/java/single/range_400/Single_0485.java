package single.range_400;

/**
 * 485. 最大连续1的个数
 * @author ：jy
 * @date ：2022/3/8 17:55
 */
public class Single_0485 {

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        System.out.println(new Single_0485().findMaxConsecutiveOnes(nums));

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }

}
