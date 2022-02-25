package single.range_1000;

/**
 * 1266. 访问所有点的最小时间
 * @Author:   江岩
 * @Date:     2020/11/29 12:43
 * @Version:  1.0
 */
public class Single_1266 {

	public static void main(String[] args) {
		
		int[][] points = new int[][] {{3,2},{-2,2}};
		
		System.out.println(minTimeToVisitAllPoints(points));
	}
	
	
	public static int minTimeToVisitAllPoints(int[][] points) {
		int len = 0;
		for (int i = 0; i < points.length-1; i++) {
			len += Math.max(Math.abs((points[i+1][1] - points[i][1])), Math.abs((points[i+1][0] - points[i][0])));
		}
		return len;
    }

	public static int minTimePoints(int[] a, int[] b) {
		
		return Math.max(Math.abs((b[2] - a[2])), Math.abs((b[1] - a[1])));

	}
	
}




