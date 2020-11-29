package single;

/**
 * 28. 实现 strStr()
 * @Author:   江岩
 * @Date:     2020/11/29 12:36
 * @Version:  1.0
 */
public class Single_0028 {

	public static void main(String[] args) {
		
		String haystack = "";
		String needle = "ll";
		System.out.println(strStr(haystack,needle));
		
	}

	
	public static int strStr(String haystack, String needle){
		
		if(needle == null || needle.length() == 0){
			return 0;
		}
		if(haystack == null || haystack.length() == 0){
			return -1;
		}
		return haystack.indexOf(needle);
	}
	
}







