package single.range_1000;

import java.util.Stack;

import bean.ListNode;

/**
 * 1290. 二进制链表转整数
 * @Author 江岩
 * @Date 12:44 2020/11/29
 **/
public class Single_1290 {
	int i = 0;
	public static void main(String[] args) {
	}
	/**
	 * 栈      1ms  37.3MB
	 * @param head
	 * @return
	 */
	public int getDecimalValue(ListNode head) {
		
		if (head == null) {
			return 0;
		}
		int ans = 0;
		while (head != null) {
			ans = (ans << 1) + head.val;
			head = head.next;
		}
		return ans;
    }
	
	
	/**
	 * 位运算    0ms   36.8MB
	 * @param head
	 * @return
	 */
	public int getDecimalValue_1(ListNode head) {
		
		if (head == null) {
			return 0;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		while (head != null) {
			stack.push(head.val);
			head = head.next;
		}
		int mark = 1;
		int ans = 0;
		while (!stack.isEmpty()) {
			ans += stack.pop() * mark;
			mark <<= 1;
		}
		
		return ans;
    }
	
	
	/**
	 * 递归     0ms   37.4MB
	 * @param head
	 * @return
	 */
	public int getDecimalValue_(ListNode head) {
		if (head == null) {
			return 0;
		}
		int val = getDecimalValue(head.next);
		return head.val == 0 ? val+i-i++ : val + (int)Math.pow(2, i++);
    }
}
