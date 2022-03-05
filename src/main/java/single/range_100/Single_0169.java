package single.range_100;


/**
 * 169. 多数元素
 */
public class Single_0169 {


    public static void main(String[] args) {

        int[] arrays = new int[]{2,2,1,1,1,2,2};
        System.out.println(new Single_0169().majorityElement(arrays));

    }

    public int majorityElement(int[] nums) {
        int res = nums[0], cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                res = nums[i];
                cnt++;
            }
        }
        return res;
    }
}
