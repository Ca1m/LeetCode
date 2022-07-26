package single.range_100.range_500;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. 分糖果
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/9
 */
public class Single_0575 {

    public static void main(String[] args) {

        int[] candyType = {6,6,6,6};
        System.out.println(new Single_0575().distributeCandies(candyType));

    }

    public int distributeCandies(int[] candyType) {

        Set set = new HashSet();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(candyType.length/2, set.size());
    }


}
