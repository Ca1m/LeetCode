package single;

import bean.ListNode;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 * @author ca1m
 */
public class Single_mian_0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int kthToLast(ListNode head, int k) {
        
		ListNode point = head;
		while (head.next != null) {
			head = head.next;
			if(k-- <= 1) {
				point = point.next;
			}
		}
		return point.val;
    }

}
