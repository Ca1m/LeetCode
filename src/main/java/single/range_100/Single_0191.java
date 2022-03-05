package single.range_100;

/**
 * 191.位1的个数
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/5
 */
public class Single_0191 {

    public static void main(String[] args) {

        System.out.println(0&1);

    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

    public int hammingWeight1(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

}
