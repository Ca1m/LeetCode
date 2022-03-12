package single.range_400;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * 414. 第三大的数
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/7
 */
public class Single_0414 {

    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 2;
        nums[1] = 1;
        nums[2] = -214783648;
        System.out.println(new Single_0414().thirdMax(nums));


    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : nums) {
            treeSet.add(i);
            if (treeSet.size() > 3) {
                treeSet.remove(treeSet.first());
            }
        }
        return treeSet.size() == 3 ? treeSet.first() : treeSet.last();
    }


    public int thirdMax01(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for (int i = nums.length-1; i > 0; --i) {
            if (nums[i] != nums[i-1] && ++j == 2) {
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    public int thirdMax02(int[] nums) {
        Integer a = null, b = null, c = null;
        for (int num : nums) {
            if (a == null || num > a) {
                c = b;
                b = a;
                a = num;
            } else if (a > num && (b == null || num > b)) {
                c = b;
                b = num;
            } else if (b != null && b > num && (c == null || num > c)){
                c = num;
            }
        }
        return c == null ? a : c;
    }

}
