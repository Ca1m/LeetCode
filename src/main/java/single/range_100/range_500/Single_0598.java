package single.range_100.range_500;

/**
 * 598. 范围求和 2
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/9
 */
public class Single_0598 {


    public static void main(String[] args) {

        int[][] ops = new int[][] {{}};


    }

    public int maxCount(int m, int n, int[][] ops) {

        for (int[] nums : ops) {
            m = Math.min(m, nums[0]);
            m = Math.min(m, nums[1]);
        }
        return m * n;
    }

}
