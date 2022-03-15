package single.range_200;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/12
 */
public class Single_0242 {

    public static void main(String[] args) {

        boolean flag = new Single_0242().isAnagram("anagram", "nagaram");
        System.out.println(flag);

    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {return false;}
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram001(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
