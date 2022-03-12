package single.range_400;

import java.util.HashMap;
import java.util.Map;

/**
 * 496. 下一个更大元素 1
 * @author : jy
 * @date : 2022/3/8 19:08
 */
public class Single_0496 {

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        int[] nums3 = new Single_0496().nextGreaterElement(nums1, nums2);
        for (int i : nums3) {
            System.out.print(i + ",");
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int z = 0;
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            for (int j = index+1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[z] = nums2[j];
                    break;
                }
            }
            if (result[z] == 0) {
                result[z] = -1;
            }
            z++;
        }
        return result;
    }

}
