package single.range_100;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/7
 */
public class Single_0448 {

    public static void main(String[] args) {

        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> list = new Single_0448().findDisappearedNumbers(nums);
        for (Integer i : list) {
            System.out.print(i+",");
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[(nums[i] - 1)%n] += n;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n) {
                list.add(i+1);
            }
        }
        return list;
    }

}
