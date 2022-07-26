package single.range_100.range_500;

/**
 * 566. 重塑矩阵
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/9
 */
public class Single_0566 {

    public static void main(String[] args) {

        int[][] mat = {{1,2}, {3,4}};
        int r = 1, c= 4;
        new Single_0566().matrixReshape(mat, r, c);

    }


    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length; // 行
        int n = mat[0].length; // 列
        if (m * n != r * c) { // 行 列
            return mat;
        }
        int[][] arr = new int[r][c];
        int z = 0, k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k < c) {
                    arr[z][k++] = mat[i][j];
                } else {
                    z++;
                    k=0;
                    arr[z][k++] = mat[i][j];
                }
            }
        }
        return arr;
    }

}
