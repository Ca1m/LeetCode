package single;

import bean.Node;

/**
 * 559. N叉树的最大深度
 * @author ca1m
 */
public class Single_0559 {
	
	private static int max = 0;
	public static void main(String[] args) {
		

	}
	
	
	
	public int maxDepth(Node root) {
        
		if (root == null) {
			return 0;
		}
		int max = 0;
		for (Node node : root.children) {
			int count = maxDepth(node);
			if (count > max) {
				max = count;
			}
		}
		return max+1;
    }

}




