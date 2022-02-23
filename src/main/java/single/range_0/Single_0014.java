package single.range_0;

/**
 * 14. 最长公共前缀
 * @Author:   江岩
 * @Date:     2020/11/29 12:30
 * @Version:  1.0
 */
public class Single_0014 {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {}));
	}
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		int len = strs.length;
		if (len == 0) {
			return "";
		}
		int minLen = strs[0].length();
		boolean flag = true;
		char c = 'a';
		for (int i = 0; i < len; i++) {
			minLen = strs[i].length() < minLen ? strs[i].length() : minLen;
		}
		for (int i = 0; i < minLen; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
					flag = false;
					break;
				}
				c = strs[j].charAt(i);
			}
			if (flag) {
				sb.append(c);
			}
		}
		if (sb.length() == 0) {
			return "";
		} else {
			return sb.toString();
		}
	}
}
