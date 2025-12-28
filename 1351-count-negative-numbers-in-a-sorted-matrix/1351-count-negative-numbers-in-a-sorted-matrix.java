class Solution {
    // First Appraoch
    // public int countNegatives(int[][] grid) {
    //     int count = 0;
    //     int m = grid.length;
    //     for(int i = 0; i < m; i++){
    //         int n = grid[i].length;
    //         for(int j = 0; j < n; j++){
    //             if(grid[i][j] < 0)
    //                 count++;
    //         }
    //     }
    //     return count;
    // }

    // Second Approach
    // public int countNegatives(int[][] grid) {
    //     int count = 0;
    //     for(int i = 0; i < grid.length; i++){
    //         for(int j = 0; j < grid[i].length; j++){
    //             if(grid[i][j] < 0){
    //                 count += grid[i].length - j;
    //                 break;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // Third Approach
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int i = m - 1, j = 0, count = 0;
        while(i >= 0 && j < n){
            if(grid[i][j] < 0){
                count += n - j;
                i--;
            }else
                j++;
        }
        return count;
    }
}