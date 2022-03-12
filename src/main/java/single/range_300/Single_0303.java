package single.range_300;

/**
 * 303. 区域和检索-数组不可变
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/7
 */
public class Single_0303 {

    public static void main(String[] args) {

        int[] nums = new int[]{-2,0,3,-5,2,-1};
        NumArray numArray = new Single_0303().new NumArray(nums);
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));


    }

    class NumArray {

        int[] sums;
        public NumArray(int[] nums) {
            int n = nums.length;
            sums = new int[n+1];
            for (int i = 0; i < n; i++) {
                sums[i+1] = sums[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sums[right+1] - sums[left];
        }
    }
}
