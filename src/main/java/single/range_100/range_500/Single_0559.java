package single.range_100.range_500;

import bean.Node;

/**
 * 559. N叉树的最大深度
 * @Author:   江岩
 * @Date:     2020/11/29 12:41
 * @Version:  1.0
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




