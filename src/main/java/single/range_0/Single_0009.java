package single.range_0;


/**
 * 9. 回文数
 * @Author:   江岩
 * @Date:     2020/11/29 10:34
 * @Version:  1.0
 */
public class Single_0009 {
	/**
	 * 启动方法
	 * @Author 江岩
	 * @Date 11:41 2020/11/29
	 **/
	public static void main(String[] args) {
		System.out.println(test(145212541));
	}
	/**
	 * (自定义方法描述)
	 * @Author 江岩
	 * @Date 12:24 2020/11/29
	 * @Param [x]
	 * @return boolean
	 **/
	public static boolean test(int x) {
		if (x <= 0) {
			return false;
		}
		int rev = 0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			if (rev >= x) {
				break;
			}
			x /= 10;
		}
		if (rev == x) {
			return true;
		}
		return false;
	}
}
