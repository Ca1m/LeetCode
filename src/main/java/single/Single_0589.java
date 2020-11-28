package single;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Node;

/**
 * 589. N叉树的前序遍历
 * 
 * @author ca1m
 *
 */
public class Single_0589 {

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

		List<Integer> list = new Single_0589().preorder(root);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	/**
	 *  递归
	 * @param root
	 * @return
	 */
	public List<Integer> preorder(Node root) {
		if (root == null) {
			return list;
		} else {
			list.add(root.val);
		}
		if (root.children.size() > 0) {
			for (Node node : root.children) {
				preorder(node);
			}
		}
		return list;
	}

}
