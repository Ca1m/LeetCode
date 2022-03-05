package single.range_100;

/**
 * 168. Excel表列名称
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/6
 */
public class Single_0168 {

    public static void main(String[] args) {

        int colunm = 701;
        System.out.println(new Single_0168().convertToTitle(colunm));

    }

    public String convertToTitle(int columnNumber) {

        StringBuffer stringBuffer = new StringBuffer();
        while (columnNumber > 0) {
            columnNumber--;
            stringBuffer.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return stringBuffer.reverse().toString();
    }
}
