package single;

/**
 * LCP 01. 猜数字
 * @author ca1m
 */
public class Single_LCP_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public int game(int[] guess, int[] answer) {

		int val = 0;
		if (guess[0] == answer[0]) {
			val++;
		}
		if (guess[1] == answer[1]) {
			val++;
		}
		if (guess[2] == answer[2]) {
			val++;
		}
		return val;
    }
	
}
