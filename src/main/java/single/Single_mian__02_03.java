package single;

import bean.ListNode;

/**
 * 面试题 02.03. 删除中间节点
 * @author ca1m
 */
public class Single_mian__02_03 {

	public static void main(String[] args) {
		
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(1);
		ListNode d = new ListNode(9);

		a.next = b;
		b.next = c;
		c.next = d;
		
		deleteNode(b);
		
		while (a != null) {
			System.out.println(a.val);
			if (a.next == null) {
				break;
			}
			a = a.next;
		}

	}
	
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
    }

}
