package single.range_100;

/**
 * 125. 验证回文串
 */
public class Single_0125 {


    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        String str02 = "race a car";
        String str03 = ".,";
        System.out.println(new Single_0125().isPalindrome(str));

    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            int first = s.charAt(i++) & 0xDF;
            int last = s.charAt(j--) & 0xDF;
            while (!((first >= 16 && first <= 25) || (first >= 65 && first <= 90))) {
                if (i >= j) {
                   return true;
                }
                first = s.charAt(i++) & 0xDF;
            }
            while (!((last >= 16 && last <= 25) || (last >= 65 && last <= 90))) {
                if (i >= j) {
                    return true;
                }
                last = s.charAt(j--) & 0xDF;
            }
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}
