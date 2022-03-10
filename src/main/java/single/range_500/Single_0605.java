package single.range_500;

/**
 * 605. 种花问题
 *
 * @author yancy
 * @version 1.0
 * @date 2022/3/10 17:42
 */
public class Single_0605 {

    public static void main(String[] args) {

        int[] nums = {1,0,0,0,0,1};
        System.out.println(new Single_0605().canPlaceFlowers(nums, 2));

    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i-1 == -1 || flowerbed[i-1] == 0) && (i+1 == flowerbed.length || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
