package single.range_300;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/7
 */
public class Single_0349 {

    public static void main(String[] args) {

        int[] nums = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] nums3 = new Single_0349().intersection(nums,nums2);
        for (int i : nums3) {
            System.out.print(i + ",");
        }
    }


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set02 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                set02.add(i);
            }
        }
        int[] result = new int[set02.size()];
        int i = 0;
        for (int j : set02) {
            result[i++] = j;
        }
        return result;
    }

}
