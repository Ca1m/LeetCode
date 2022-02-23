package single.mian;

import bean.ListNode;

/**
 * mian 0202  返回倒数第 k 个节点
 * @Author:   江岩
 * @Date:     2020/11/29 12:50
 * @Version:  1.0
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
