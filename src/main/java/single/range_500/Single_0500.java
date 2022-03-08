package single.range_500;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 500. 键盘行
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/8
 */
public class Single_0500 {

    public static void main(String[] args) {


    }

    static String firstLine = "qwertyuiop";
    static String secondLine = "asdfghjkl";
    static String thirdLine = "zxcvbnm";

    public String[] findWords(String[] words) {
        List list = new ArrayList<>();
        for (String word : words) {
            int n1 = 0, n2 = 0, n3 = 0;
            String wordTemp = word.toLowerCase();
            for (int i = 0; i < wordTemp.length(); i++) {
                String s = wordTemp.charAt(i) + "";
                if (firstLine.contains(s)) {
                    n1++;
                }
                if (secondLine.contains(s)) {
                    n2++;
                }
                if (thirdLine.contains(s)) {
                    n3++;
                }
            }
            if (n1 == word.length() || n2 == word.length() || n3 == word.length()) {
                list.add(word);
            }
        }
        return (String[])list.toArray(new String[list.size()]);
    }

}
