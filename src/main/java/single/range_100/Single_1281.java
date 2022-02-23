package single.range_100;

/**
 * 1281. 整数的各位积和之差
 * @Author:   江岩
 * @Date:     2020/11/29 12:43
 * @Version:  1.0
 */
public class Single_1281 {

	public static void main(String[] args) {
		
		int n = 705;
		
		System.out.println(subtractProductAndSum(n));
	}
	
	public static int subtractProductAndSum(int n) {

		int mul = 1;
		int sum = 0;
		while ((n = n / 10) != 0) {
			mul *= n%10;
			sum += n%10;
		}
		return	mul - sum;
		
    }

}
