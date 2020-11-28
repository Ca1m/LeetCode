package single;

public class Single_0009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(145212541));
	}

	public static boolean test(int x) {
		
		if (x <= 0) {
			return false;
		}
		int rev = 0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			if (rev >= x) {
				break;
			}
			x /= 10;
		}
		if (rev == x) {
			return true;
		}
		return false;
	}
}
