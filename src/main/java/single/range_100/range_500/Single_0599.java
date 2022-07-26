package single.range_100.range_500;

import java.util.*;

/**
 * 599. 两个列表的最小索引总和
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/10
 */
public class Single_0599 {


    public static void main(String[] args) {

        String[] s1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] s2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        String[] str = new Single_0599().findRestaurant(s1, s2);
        for (String s : str) {
            System.out.print(s + ",");
        }

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            findRestaurant(list2, list1);
        }
        List<String> list = new ArrayList<>();
        int index = list1.length + list2.length;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int count = map.get(list2[i]) + i;
                if (index == count) {
                    list.add(list2[i]);
                }
                if (index > count) {
                    list.clear();
                    index = count;
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
