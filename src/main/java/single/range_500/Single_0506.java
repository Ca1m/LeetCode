package single.range_500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. 相对名次
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/8
 */
public class Single_0506 {

    public static void main(String[] args) {

        int[] nums = {10, 3, 8, 9, 4};
        String[] ss = new Single_0506().findRelativeRanks(nums);
        for (String s : ss) {
            System.out.print(s + ",");
        }

    }

    // 9ms  54 5
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                ans[arr[i][1]] = desc[i];
            } else {
                ans[arr[i][1]] = Integer.toString(i+1);
            }
        }
        return ans;
    }

    // 6ms  90  5
    public String[] findRelativeRanks01(int[] score) {

        int len = score.length;
        String[] result = new String[len];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < len; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                result[map.get(score[i])] = "Gold Medal";
            }
            if (i == len - 2) {
                result[map.get(score[i])] = "Silver Medal";
            }
            if (i == len - 3) {
                result[map.get(score[i])] = "Bronze Medal";
            }
            if (i < len - 3) {
                result[map.get(score[i])] = String.valueOf(len - i);
            }
        }
        return result;
    }

}
