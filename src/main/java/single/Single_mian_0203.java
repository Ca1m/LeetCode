package single;

import bean.ListNode;

/**
 * mian 0203 删除中间节点
 * @Author:   江岩
 * @Date:     2020/11/29 12:51
 * @Version:  1.0
 */
public class Single_mian_0203 {

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
