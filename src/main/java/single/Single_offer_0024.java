package single;

import bean.ListNode;

/**
 * offer 24  反转链表
 * @Author:   江岩
 * @Date:     2020/11/29 12:48
 * @Version:  1.0
 */
public class Single_offer_0024 {

	public static void main(String[] args) {
		
		ListNode node_1 = new ListNode(1);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(3);
		ListNode node_4 = new ListNode(4);
		ListNode node_5 = new ListNode(5);
		
		node_1.next = node_2;
		node_2.next = node_3;
		node_3.next = node_4;
		node_4.next = node_5;
		
		System.out.println(reverseList(null));
	}
	
	public static ListNode reverseList(ListNode head) {

		if (head == null) {
			return head;
		}
		ListNode temp = head.next;
		head.next = null;
		
		return reverseList_(head, temp);
    }

	
	public static ListNode reverseList_(ListNode node, ListNode node_r) {
		
		if (node_r == null) {
			return node;
		}
		ListNode temp = node_r.next;
		node_r.next = node; // 修改的是对象的属性
		return reverseList_(node_r, temp);
	}
	
}
