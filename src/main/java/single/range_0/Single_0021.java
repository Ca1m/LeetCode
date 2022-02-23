package single.range_0;

import bean.ListNode;

//  1->2->4, 1->3->4
//  1->1->2->3->4->4
/**
 * 21. 合并两个有序链表
 * @Author:   江岩
 * @Date:     2020/11/29 12:31
 * @Version:  1.0
 */
public class Single_0021 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(6);
		
		ListNode l3 = mergeTwoLists(l1,l2);
		while(l3.next != null){
			
			System.out.print(l3.val+"->");
			l3 = l3.next;
		}
		System.out.print(l3.val);
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode curr = l3;
		while(l1 != null && l2 != null){	
			if(l1.val < l2.val){	
				curr.next = l1;
				l1 = l1.next;
				curr = curr.next;
			}else{
				curr.next = l2;
				l2 = l2.next;
				curr = curr.next;
			}
		}
		if(l1 == null){
			curr.next = l2;
		}
		if(l2 == null){
			curr.next = l1;
		}
		return l3.next;
	}
}
