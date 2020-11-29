package single;

import java.util.Arrays;

/**
 * 66. 加一
 * @Author:   江岩
 * @Date:     2020/11/29 12:38
 * @Version:  1.0
 */
public class Single_0066 {

	public static void main(String[] args) {

		int[] digits = { 9, 9, 9, 9 };
		digits = plusOne(digits);
		for (int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}
	}

	/**
	 * @param digits
	 * @return
	 */
	public static int[] plusOne(int[] digits) {
		boolean overFill = false;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1 || overFill) {
				if (digits[i] == 9) {
					digits[i] = 0;
					overFill = true;
				} else {
					digits[i] += 1;
					overFill = false;
				}
			}
		}
		if (overFill) {
			int[] is = new int[digits.length + 1];
			is[0] = 1;
			System.arraycopy(digits, 0, is, 1, digits.length);
			return is;
		}
		return digits;
	}

}
