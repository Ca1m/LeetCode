package single;

import bean.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * TODO :  创建链表，翻转
 * @author Infosec_jy
 *
 */
public class Single_0206 {
	public static void main(String[] args) {
		int[] vals = new int[]{1,2,3,4,5};
		ListNode head = new ListNode(vals[0]);
		ListNode pos = head;
		for(int i = 1;i < vals.length; i++){
			pos.next = new ListNode(vals[i]);
			pos = pos.next;
		}
	//	ListNode head = null;			      考虑 head 为 null
	//	ListNode head = new ListNode(6);  考虑 head.next 为 null
		ListNode result = reverseList(head);
		while(result != null){
			System.out.print(result.val);
			result = result.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
		
		ListNode pre = null;
		ListNode cur = head;
		ListNode next;
		while(cur != null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
}





