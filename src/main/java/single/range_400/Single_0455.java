package single.range_400;

import java.util.Arrays;

/**
 * 455. 分发饼干
 *
 * @author : jy
 * @date : 2022/3/8 16:22
 */
public class Single_0455 {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,1,3};
        int[] nums2 = new int[]{1,1};

        System.out.println(new Single_0455().findContentChildren(nums1, nums2));

    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int childNumber = g.length, cookieNumber = s.length;
        for (int i = 0, j = 0; i < childNumber && j < cookieNumber; i++, j++) {
            while (j < cookieNumber && g[i] < s[j]) {
                j++;
            }
            if (j < cookieNumber){
                count++;
            }
        }
        return count;
    }

}
