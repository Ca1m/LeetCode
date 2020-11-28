package single;

import bean.ListNode;

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
