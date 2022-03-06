package single.range_100;

/**
 * 190. 颠倒二进制位
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/5
 */
public class Single_0190 {

    public static void main(String[] args) {

        
        int n = 964176192;
        System.out.println(new Single_0190().reverseBits(n));
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int a = 0;
        for (int i = 0; i <= 31; i++) {
            a = a + ((1&(n>>i))<<(31-i));
        }
        return a;
    }
}
