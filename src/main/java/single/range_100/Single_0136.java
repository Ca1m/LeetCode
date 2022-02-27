package single.range_100;

/**
 * 0136. 只出现一次的数字
 *
 * @author yancy
 * @version 1.0
 * @data 2022/2/26
 */
public class Single_0136 {

    public static void main(String[] args) {

        int[] arrays = new int[]{2,2,1};
        int z = new Single_0136().singleNumber(arrays);
        System.out.println(z);
    }

    public int singleNumber(int[] nums) {
        int z = 0;
        for (int i : nums) {
            z = i^z;
        }
        return z;
    }


}
