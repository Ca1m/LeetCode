package single.range_0;

import java.util.Stack;
/**
 * 20. 有效的括号
 * @Author:   江岩
 * @Date:     2020/11/29 12:31
 * @Version:  1.0
 */
public class Single_0020 {

	public static void main(String[] args) {
		System.out.println(isValid("((([])))"));
	}

	public static boolean isValid(String s){
		
		Stack stack = new Stack();
		for(int i = 0; i < s.length(); i++){

			if(s.charAt(i) == '('){
				stack.push(1);
			}
			if(s.charAt(i) == '{'){
				stack.push(2);
			}
			if(s.charAt(i) == '['){
				stack.push(3);
			}
			if(stack.size() == 0){
				return false;
			}
			if(s.charAt(i) == ')' && (int)stack.pop() != 1){
				return false;
			}

			if(s.charAt(i) == '}' && (int)stack.pop() != 2){
				return false;
			}
			if(s.charAt(i) == ']' && (int)stack.pop() != 3){
				return false;
			}
		}
		if(stack.size() != 0){
			return false;
		}
		return true;
	}
}
