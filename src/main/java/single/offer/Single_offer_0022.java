package single.offer;

import bean.ListNode;

/**
 * offer 22 链表中倒数第k个节点
 * @Author:   江岩
 * @Date:     2020/11/29 12:48
 * @Version:  1.0
 */
public class Single_offer_0022 {

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
