package single.range_400;

/**
 * 461. 汉明距离
 * @Author:   江岩
 * @Date:     2020/11/29 12:40
 * @Version:  1.0
 */
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
