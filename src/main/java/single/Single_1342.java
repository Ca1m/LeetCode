package single;

/**
 * 1342. 将数字变成 0 的操作次数
 * @author ca1m
 */
public class Single_1342 {

	public static void main(String[] args) {
		
		int num = 13;
		
		System.out.println(numberOfSteps(num));
	}
	
	
	public static int numberOfSteps(int num) {
		int time = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num--;
			}
			time++;
		}
		return time;
    }

}
