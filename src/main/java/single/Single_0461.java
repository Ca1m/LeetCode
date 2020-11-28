package single;

public class Single_0461 {

	public static void main(String[] args) {
		

		int x = 1,y=4;
		int number = Single_0461.hammingDistance(x, y);
		
		System.out.println(number);
	}

	public static int hammingDistance(int x, int y) {
        
		int res = x ^ y;
		int count =0;
		
		while(res != 0){
			if((res & 1) == 1){
				count++;
			}
			res = res >> 1;
			
		}
		return count;
    }
	
}
