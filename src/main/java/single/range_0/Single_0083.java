package single.range_0;

import bean.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * @Author:   江岩
 * @Date:     2020/11/29 12:39
 * @Version:  1.0
 */
public class Single_0083 {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
//		head.next = new ListNode(1);
//		head.next.next = new ListNode(2);
//		head.next.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(3);
		
		ListNode l = deleteDuplicates(null);
		
		while(l.next != null){
			System.out.println(l.val);
			l = l.next;
		}
		System.out.println(l.val);
		
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}
		ListNode node = head;
		while(node.next != null){	
			if(node.val == node.next.val){
				node.next = node.next.next;
			}else{
				node = node.next;
			}
		}
		return head;
    }
	
}
