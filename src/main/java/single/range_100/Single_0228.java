package single.range_100;

import java.util.ArrayList;
import java.util.List;

/**
 * 228.汇总区间
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/6
 */
public class Single_0228 {

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,4,5,7};
        List<String> list = new Single_0228().summaryRanges(nums);

        for (String s : list) {
            System.out.println(s);
        }
    }


    // i
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length || nums[i+1] != nums[i] + 1) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("->");
                }
                stringBuffer.append(nums[i]);
                list.add(stringBuffer.toString());
                stringBuffer = new StringBuffer();
            } else {
                if (stringBuffer.length() == 0) {
                    stringBuffer.append(nums[i]);
                }
            }
        }
        return list;
    }

}



