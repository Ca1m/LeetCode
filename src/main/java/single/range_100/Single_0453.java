package single.range_100;

import java.util.Arrays;

/**
 * 453. 最小操作次数使数组元素相等
 */
public class Single_0453 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};
        System.out.println(new Single_0453().minMoves(nums));
    }

    public int minMoves(int[] nums) {

        int minNum = Arrays.stream(nums).min().getAsInt();
        int count = 0;
        for (int num : nums) {
            count += num - minNum;
        }
        return count;
    }
}
