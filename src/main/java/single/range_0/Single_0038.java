package single.range_0;


/**
 * 38. 外观数列
 * @Author:   江岩
 * @Date:     2020/11/29 12:36
 * @Version:  1.0
 */
public class Single_0038 {

	public static void main(String[] args) {

		System.out.println(countAndSay(10));
	}

	public static String countAndSay(int n) {
		String[] ss = new String[31];
		ss[1] = "1";
		ss[2] = "11";
		for (int i = 2; i < 30; i++) {
			char[] cs = ss[i].toCharArray();
			int count = 1;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < cs.length - 1; j++) {
				if (cs[j] != cs[j + 1]) {
					sb.append(count);
					sb.append(cs[j]);
					count = 1;
				} else {
					count++;
				}
				if (j + 2 >= cs.length) {
					sb.append(count);
					sb.append(cs[j + 1]);
				}
			}
			ss[i + 1] = sb.toString();
		}
		return ss[n];
	}
}
