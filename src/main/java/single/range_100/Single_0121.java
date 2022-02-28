package single.range_100;


/**
 * 121. 买卖股票的最佳时机
 */
public class Single_0121 {


    public static void main(String[] args) {

        int[] array = new int[]{7,1,5,3,6,4};
        int[] array02 = new int[]{7,6,4,3,1};
        System.out.println(new Single_0121().maxProfit(array));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
           max = Math.max(max, prices[i] - min);
           min = Math.min(min, prices[i]);
        }
        return max;
    }
}
