package single;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Node;

/**
 * 590. N叉树的后序遍历
 * 
 * 输入：  
 *        1
 *    3   2  4
 *  5   6
 *   
 *   前序遍历： 5 3 1 2 4 6    
 *   中序遍历： 1 3 5 6 2 4
 *   后序遍历： 5 6 3 2 4 1
 *   
 * 
 * @author ca1m
 */
public class Single_0590 {

	private List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		
		Node root = new Node(1);
		Node node_1 = new Node(3);
		Node node_2 = new Node(2);
		Node node_3 = new Node(4);
		Node node_4 = new Node(5);
		Node node_5 = new Node(6);
		
		List<Node> list_1 = new ArrayList<Node>();
		list_1.add(node_1);
		list_1.add(node_2);
		list_1.add(node_3);
		List<Node> list_2 = new ArrayList<Node>();
		list_2.add(node_4);
		list_2.add(node_5);
		
		root.children = list_1;
		node_1.children = list_2;
		node_2.children = new ArrayList<Node>();

		List<Integer> list = new Single_0590().postorder(root);
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public List<Integer> postorder(Node root) {
        
		if (root == null) {
			return list;
		}
		if (root.children != null && root.children.size() > 0) {
			postorder(root.children.get(0)); // left  node
			for (int i = 1; i < root.children.size(); i++) {
				postorder(root.children.get(i));
			}
		}
		list.add(root.val);
		return list;
    }
	
}



