package hard;

/**
 * 76. 最小覆盖子串
 * @Author:   江岩
 * @Date:     2020/11/29 12:57
 * @Version:  1.0
 */
public class Hard_0076 {

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println(new Hard_0076().minWindow(s, t));

	}

	public String minWindow(String s, String t) {

		if (s.length() == 0 || t.length() == 0) {
			return "";
		}
		
		int[] index_curr = new int[t.length()]; // 不一定最小
		int[] index = new int[t.length()]; // 一定最小
		for (int i = 0; i < t.length(); i++) {
			index_curr[i] = s.length();
			index[i] = s.length();
		}
		
		
		char[] t_chars = new char[t.length()];
		char[] s_chars = new char[s.length()];
		for (int i = 0; i < t.length(); i++) {
			t_chars[i] = t.charAt(i);
		}
		for (int i = 0; i < s.length(); i++) {
			s_chars[i] = s.charAt(i);
		}
		
		for (int j = 0; j < t_chars.length; j++) { // 第一个子串产生，也是第一个窗口
			for (int i = 0; i < s_chars.length; i++) {
				if (s_chars[i] == t_chars[j]) {
					boolean flag = false;
					for (int k = 0; k < index.length; k++) {
						if(index_curr[k] == i) {
							flag = true;
							break;
						}
					}
					if (flag) {
						continue;
					}
					index_curr[j] = i;
					index[j] = i; // 第一次保存
					break;
				}
			}
		}
		for (int i = 0; i < index_curr.length; i++) {
			if (index_curr[i] == s.length()) {
				return "";
			}
		}
		index = minWindow_(index_curr, index, s_chars, t_chars);
		int small = s.length();
		int big = 0;
		for (int i = 0; i < index.length; i++) {
			if (index[i] < small) {
				small = index[i];
			}
			if (index[i] > big) {
				big = index[i];
			}
		}
		return s.substring(small, big + 1);
    }
	
	public static int[] minWindow_(int[] index_curr, int[] index, char[] s_chars,char[] t_chars) {
		
		int index_ = 0;
		int small_1 = s_chars.length;
		char index_pos = 'A';
		for (int i = 0; i < index_curr.length; i++) { // 获取最小的值
			if (index_curr[i] < small_1) {
				small_1 = index_curr[i];
				index_pos = t_chars[i]; // 滑动窗口的第一个 值
				index_ = i;
			}
		}
		
		for (int i = small_1+1; i < s_chars.length; i++) { // 滑动过程中找到了 更合适的值
			if (s_chars[i] == index_pos) {
				boolean flag = false;
				for (int k = 0; k < index.length; k++) {
					if(index_curr[k] == i) {
						flag = true;
						break;
					}
				}
				if (flag) {
					continue;
				}
				index_curr[index_] = i;
				if(change(index_curr, index, s_chars.length)) {
					for (int j = 0; j < index_curr.length; j++) {
						index[j] = index_curr[j];
					}
				}
				return minWindow_(index_curr, index, s_chars, t_chars);
			}
		}
		return index;
	}
	
	public static boolean change(int[] index_curr, int[] index, int s_len) {
		int small = s_len, small_ = s_len;
		int big = 0, big_ = 0;
		for (int i = 0; i < index_curr.length; i++) {
			if (index_curr[i] > big) {
				big = index_curr[i];
			}
			if (index_curr[i] < small) {
				small = index_curr[i];
			}
			if (index[i] > big_) {
				big_ = index[i];
			}
			if (index[i] < small_) {
				small_ = index[i];
			}
		}
		return big-small < big_-small_ ? true : false; 
	}
}
