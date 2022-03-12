package single.range_400;

/**
 * 495. 提莫攻击
 * @author ：jy
 * @date ：2022/3/8 18:56
 */
public class Single_0495 {

    public static void main(String[] args) {

        int[] nums = {1,4,5,8};
        int duration = 2;
        System.out.println(new Single_0495().findPoisonedDuration(nums, duration));;

    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i+1] - timeSeries[i] >= duration) {
                count += duration;
            } else {
                count += timeSeries[i+1] - timeSeries[i];
            }
        }
        count += duration;
        return count;
    }

}
