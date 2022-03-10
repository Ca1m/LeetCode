package single.range_500;

import java.util.*;

/**
 * 594. 最长和谐子序列
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/9
 */
public class Single_0594 {

    public static void main(String[] args) {

        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(new Single_0594().findLHS(nums));
    }

    public int findLHS(int[] nums) {

        int max = 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key+1)) {
                max = Math.max(max, map.get(key) + map.get(key+1));
            }
        }
        return max;
    }

    public int findLHS01(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int begin = 0;
        for (int end = 0; end < nums.length; end++) {
            while (nums[end] - nums[begin] > 1) {
                begin++;
            }
            if (nums[end] - nums[begin] == 1) {
                max = Math.max(max, end - begin+1);
            }
        }
        return max;
    }




}

