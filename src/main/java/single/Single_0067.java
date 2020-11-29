package single;

/**
 * 67. 二进制求和
 * @Author:   江岩
 * @Date:     2020/11/29 12:38
 * @Version:  1.0
 */
public class Single_0067 {

	public static void main(String[] args) {

		String a = "10111";
		String b = "1010";

		System.out.println(addBinary(a, b));

	}

	public static String addBinary(String a, String b) {

		char[] ca = new StringBuffer(a).reverse().toString().toCharArray();
		char[] cb = new StringBuffer(b).reverse().toString().toCharArray();

		StringBuffer sb = new StringBuffer();
		int len = ca.length > cb.length ? ca.length : cb.length;

		boolean flag = false;
		for (int i = 0; i < len; i++) {

			if (i > ca.length - 1) {
				if (flag) {
					if (cb[i] == '1') {
						sb.append("0");
						flag = true;
					} else {
						sb.append("1");
						flag = false;
					}
				} else {
					sb.append(cb[i]);
				}
				continue;
			}
			if (i > cb.length - 1) {
				if (flag) {
					if (ca[i] == '1') {
						sb.append("0");
						flag = true;
					} else {
						sb.append("1");
						flag = false;
					}
				} else {
					sb.append(ca[i]);
				}
				continue;
			}
			if (ca[i] == '0' && cb[i] == '0') {
				if (flag) {
					sb.append("1");
					flag = false;
				} else {
					sb.append("0");
				}
			} else if (ca[i] == '1' && cb[i] == '1') {
				if (flag) {
					sb.append("1");
				} else {
					sb.append("0");
				}
				flag = true;
			} else {
				if (flag) {
					sb.append("0");
					flag = true;
				}else{
					sb.append("1");
				}
			}
		}
		if (flag){
			sb.append("1");
		}
		return sb.reverse().toString();
	}
}
