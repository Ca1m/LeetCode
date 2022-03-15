package single.range_200;

import java.util.*;

/**
 * 290. 单词规律
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/12
 */
public class Single_0290 {

    public static void main(String[] args) {

        String pattern = "abba";
        String str = "dog cat cat dog";
        boolean flag = new Single_0290().wordPattern(pattern, str);
        System.out.println(flag);
    }

    public boolean wordPattern(String pattern, String s) {

        String[] ss = s.split(" ");
        if (pattern.length() != ss.length) { return false;}

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) == null) {
                map.put(pattern.charAt(i), ss[i]);
                if(!set.add(ss[i])) {
                    return false;
                }
            } else {
                if (!map.get(pattern.charAt(i)).equals(ss[i])) {
                    return false;
                }
            }
        }
        return true;
    }


}
