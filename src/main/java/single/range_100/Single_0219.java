package single.range_100;

import java.util.HashMap;
import java.util.Map;

/**
 * 219.存在重复元素2
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/6
 */
public class Single_0219 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,0,1,1};
        boolean flag = new Single_0219().contansNearbyDuplicate(nums, 1);
        System.out.println(flag);
    }

    // Map 记录角标
    public boolean contansNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
