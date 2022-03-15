package single.range_200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 205. 同构字符串
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/12
 */
public class Single_0205 {

    public static void main(String[] args) {

        boolean flag = new Single_0205().isIsomorphic("paper", "title");
        System.out.println(flag);
    }

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                if (t.charAt(i) != map.get(s.charAt(i))) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
                if (!set.add(t.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

}
