package single;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 * @author ca1m
 */
public class Single_1431 {

	public static void main(String[] args) {
		
	}

	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
		int max_Val = 0;
		for (int i = 0; i < candies.length; i++) { // 获取最大值
			if (candies[i] > max_Val) {
				max_Val = candies[i];
			}
		}
		
		List<Boolean> list_bool = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max_Val) {
				list_bool.add(true);
			} else {
				list_bool.add(false);
			}
		}
		return list_bool;
    }
	
}
