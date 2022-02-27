package single.range_100;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * @author yancy
 * @version 1.0
 * @data 2022/2/26
 */
public class Single_0118 {

    public static void main(String[] args) {

        List<List<Integer>> list = new Single_0118().generate(5);
        for (List<Integer> list1 : list) {
            System.out.print("[");
            for (int i = 0; i < list1.size()-1; i++) {
                System.out.print(list1.get(i) + ",");
            }
            System.out.print(list1.get(list1.size()-1));
            System.out.print("],");
        }
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> listAll = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        listAll.add(list);

        for (int i = 1; i < numRows; i++) {
            List<Integer> listTemp = new ArrayList<Integer>();
            List<Integer> listBefore = listAll.get(i-1);
            listTemp.add(1);
            for (int j = 0; j < i-1; j++) {
                listTemp.add(listBefore.get(j) + listBefore.get(j+1));
            }
            listTemp.add(1);
            listAll.add(listTemp);
        }
        return listAll;
    }
}
