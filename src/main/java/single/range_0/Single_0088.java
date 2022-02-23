package single.range_0;

import java.util.Arrays;

public class Single_0088 {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] nums3 = new int[]{0};
        int[] nums4 = new int[]{1};

        new Single_0088().merge(nums3,0,nums4,1);
        System.out.println(Arrays.toString(nums3));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m--+--n;
        while (end >= 0 && n >= 0 && m >= 0) {
            nums1[end--] = nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--];
        }
        while(end >= 0 && n >= 0) {
            nums1[end--] = nums2[n--];
        }
    }
}
