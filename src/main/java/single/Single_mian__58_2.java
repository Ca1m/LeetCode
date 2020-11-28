package single;

/**
 * 面试题58 - II. 左旋转字符串
 * @author ca1m
 */
public class Single_mian__58_2 {

	public static void main(String[] args) {
		
		String s = null;
		int n = 0;

		System.out.println(reverseLeftWords(s, n));
		
	}
	
	
	public static String reverseLeftWords(String s, int n) {
		if (s == null) {
			return "";
		}
		return s.substring(n, s.length()) + s.substring(0, n);
    }

}
