package single.range_100;

/**
 * 463. 岛屿的周长
 * @author ：jy
 * @date ：2022/3/8 17:08
 */
public class Single_0463 {

    public static void main(String[] args) {

        int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        System.out.println(new Single_0463().islandPerimeter(grid));
    }

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    // 将遍历的格子，移动，如果移出界外，+1 如果移动之后是 水域，+1
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    for (int z = 0; z < 4; z++) {
                        int tx = i + dx[z];
                        int ty = j + dy[z];
                        if (tx < 0 || tx == m || ty < 0 || ty == n || grid[tx][ty] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }



    public int islandPerimeter01(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int temp = 4;
                    if ( i + 1 < m && grid[i+1][j] == 1) {
                        temp -= 2;
                    }
                    if ( j + 1 < n && grid[i][j+1] == 1) {
                        temp -= 2;
                    }
                    count += temp;
                }
            }
        }
        return count;
    }

}
