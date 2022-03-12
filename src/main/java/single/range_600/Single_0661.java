package single.range_600;

/**
 * 661. 图片平滑器
 *
 * @author yancy
 * @version 1.0
 * @since 2022/3/12
 */
public class Single_0661 {

    public static void main(String[] args) {

        int[][] img = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        int [][] nums2 = new Single_0661().imageSmoother(img);
        for (int[] nums : nums2) {
            for (int i : nums) {
                System.out.print(i + ",");
            }
            System.out.println("");
        }
    }


    public int[][] imageSmoother(int[][] img) {

        int m = img.length;
        int n = img[0].length;
        int[][] nums = new int[m][n];
        if (m == n && m == 1){
            return img;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                sum += sum(img, i-1, j-1) + sum(img, i-1,j) + sum(img, i-1, j+1);
                sum += sum(img, i, j-1) + sum(img, i, j+1) + img[i][j];
                sum += sum(img, i+1, j-1) + sum(img, i+1, j) + sum(img, i+1, j+1);
                if ((i == 0 && (j == 0 || j == n-1)) || (i == m-1 && (j == 0 || j == n-1))) {
                    if ((i == 0 && i == m - 1) || (j == 0 && j == n - 1)) {
                        nums[i][j] = (int)1.0 * sum / 2;
                    } else {
                        nums[i][j] = (int)1.0 * sum / 4;
                    }
                } else if (i == 0 || j == 0 || i == m-1 || j == n-1) {
                    if ((i == 0 && i == m - 1) || (j == 0 && j == n - 1)) {
                        nums[i][j] = (int)1.0 * sum / 3;
                    } else {
                        nums[i][j] = (int)1.0 * sum / 6;
                    }
                } else {
                    nums[i][j] = (int)1.0 * sum / 9;
                }
            }
        }
        return nums;
    }

    private static int sum(int[][] img, int i, int j) {

        if (i >= 0 && i < img.length && j >= 0 && j < img[0].length){
            return img[i][j];
        } else {
            return 0;
        }
    }


}
