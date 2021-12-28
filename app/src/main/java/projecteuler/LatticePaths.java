package projecteuler;

/**
 * Starting in the top left corner of a 20×20 grid,
 * and only being able to move to the right and down,
 * How many such routes are there to the bottom right corner.
 *
 * e.g a 2 x 2 grid has 6 unique routes.
 */

public class LatticePaths {
    public int calculateRoutes (int n) {
        if (n <= 1) {
            return n == 0 ? 0 : 1;
        }

        final int N = n + 1;
        // 20 x 20 grid has 21 edges from edge 0 to edge 21
        int[][] grid = new int[N][N];

        // We can move only to the right along the top edge
        // move down along the leftmost edge.

        for (int c = 0; c < N; c++) {
            grid[0][c] = 1;
        }

        for (int r = 0; r < N; r++) {
            grid[r][0] = 1;
        }


        // For other grids, we can move either from the grid just above the current one or
        // the grid to the left of the current one.

        for (int r = 1; r < N; r++) {
            for (int c = 1; c < N; c++) {
                grid[r][c] = grid[r][c - 1] + grid[r - 1][c];
            }
        }

        return grid[n][n];
    }

    public static void main(String[] args) {
        LatticePaths lp = new LatticePaths();
        int n = 20;
        int res = lp.calculateRoutes(n);
        System.out.println("The total routes are : " +  res);
    }
}
