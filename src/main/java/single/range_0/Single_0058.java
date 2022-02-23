package single.range_0;

/**
 * 28. 最后一个单词的长度
 * @Author:   江岩
 * @Date:     2020/11/29 12:37
 * @Version:  1.0
 */
public class Single_0058 {

	public static void main(String[] args) {
		
		String s = "Today is a nice day  ";
		
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s){
		
		if(s == null || s.trim().length() == 0){
			return 0;
		}
		int lastLen = 0;
		int count = 0;
		char[] cs = s.toCharArray();
		for(int i = 0; i < s.length(); i++){
			if(cs[i] == ' '){	
				if(count != 0){ // 判断 纯属 为了 " "、  "  "
					lastLen = count;
				}
				count = 0;
			}else{
				count ++;
				if(i == s.length()-1){ // 判断为了 最后一个不是 " "
					lastLen = count;
				}
			}
		}
		return lastLen;
	}
}
