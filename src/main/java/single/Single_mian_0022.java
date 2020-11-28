package single;

import bean.ListNode;

/**
 * 面试题 02 返回倒数第 k 个节点
 * @author ca1m
 */
public class Single_mian_0022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode getKthFromEnd(ListNode head, int k) {

		if (head == null) {
			return null;
		}
		ListNode point = head;
		int count = 0;
		while (point != null) {
			count++;
			point = point.next;
		}
		int index = count - k + 1;
		while (index-- > 1) {
			head = head.next;
		}
		return head;
    }

}
