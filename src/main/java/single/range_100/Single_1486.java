package single.range_100;

/**
 * 1486. 数组异或操作
 * @Author:   江岩
 * @Date:     2020/11/29 12:47
 * @Version:  1.0
 */
public class Single_1486 {

	public static void main(String[] args) {
		System.out.println(xorOperation(10, 5));
	}
	
	public static int xorOperation(int n, int start) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result ^= 2 * i + start;
		}
		return result;
    }

}
