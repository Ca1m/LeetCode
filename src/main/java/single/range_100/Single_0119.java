package single.range_100;

import java.util.Arrays;
import java.util.List;

/**
 * 119. 杨辉三角 2
 *
 * @author yancy
 * @version 1.0
 * @data 2022/2/26
 */
public class Single_0119 {


    public static void main(String[] args) {

        List<Integer> list = new Single_0119().getRow(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
    }

    public List<Integer> getRow(int rowIndex) {

        Integer[] arrays = new Integer[rowIndex+1];
        Arrays.fill(arrays, 1);

        for (int i = 2; i < arrays.length; i++) {
            for (int j = i-1; j > 0; j--) {
                arrays[j] = arrays[j] + arrays[j-1];
            }
        }
        return Arrays.asList(arrays);
    }
}
