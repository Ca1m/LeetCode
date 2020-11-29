package single;

import javax.swing.plaf.synth.SynthTabbedPaneUI;


/**
 * 557. 反转字符串中的单词 III
 * @Author:   江岩
 * @Date:     2020/11/29 12:40
 * @Version:  1.0
 */
public class Single_0557 {

	public static void main(String[] args) {

		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	
	public static String reverseWords(String s) {
		
		char[] cs = s.toCharArray();
		int left = 0, right = 0;
		while (right < cs.length) {
			while (left < cs.length && cs[left] == ' ') {
				left++;
			}
			while (right < cs.length && cs[right] != ' ') {
				right++;
			}
			reverseChar(cs, left, right-1);
			left = right + 1;
			right = right + 2;
		}
		return String.valueOf(cs);
    }
	
	
	public static void reverseChar(char[] cs, int left, int right) {
		char temp;
		while (left < right) {
			temp = cs[left];
			cs[left++] = cs[right];
			cs[right--] = temp;
		}
	}
}




