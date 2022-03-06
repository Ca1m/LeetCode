package single.range_100;

import java.util.*;

/**
 * 217. 存在重复元素
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/6
 */
public class Single_0217 {

    public static void main(String[] args) {

    }

    // Set 做法
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    // 简洁写法，但是这个耗时久
    public boolean containsDuplicate003(int[] nums) {

        return Arrays.stream(nums).distinct().count() != 0 ? true : false;
    }

    // 常规理解
    public boolean containsDuplicate002(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.get(i) != null) {
                return true;
            } else {
                map.put(i,1);
            }
        }
        return false;
    }

    // 耗时超长
    public boolean containsDuplicate01(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (list.contains(i)) {
                return true;
            } else {
                list.add(i);
            }
        }
        return false;
    }
}
