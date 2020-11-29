package single;

import bean.ListNode;

/**
 * mian 0207 链表相交
 * @Author:   江岩
 * @Date:     2020/11/29 12:50
 * @Version:  1.0
 */
public class Single_mian_0207 {

	public static void main(String[] args) {
		

	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
		if (headA == null || headB == null)
            return null;
        
        ListNode h1 = headA, h2 = headB;
        while (h1 != h2) {

            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }
		return h1;
    }
}
