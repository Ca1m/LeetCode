package single;

/**
 * 70. 爬楼梯
 * @Author:   江岩
 * @Date:     2020/11/29 12:38
 * @Version:  1.0
 */
public class Single_0070 {

	public static void main(String[] args) {
		
		System.out.println(climbStaris(5));
	}

	public static int climbStaris(int n){
		
		int first = 1;
		int second = 2;
		if(n == 1){
			return 1;
		}
		for(int i = 3; i <= n; i++){
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
}
