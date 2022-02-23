package single.offer;

/**
 * offer 0058-2  左旋转字符串
 * @Author:   江岩
 * @Date:     2020/11/29 12:54
 * @Version:  1.0
 */
public class Single_offer_0058_2 {

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
