package arrays;

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] grid, int val){
        int rows = grid.length, cols = grid[0].length;
        int row = 0, col = cols - 1;
        while(row < rows && col >= 0){
            if(grid[row][col] == val) return true;
            else if(grid[row][col] > val) col--;
            else row++;
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
            {60, 61, 62, 63}
        };
        Search2DMatrixII searcher = new Search2DMatrixII();
        System.out.println(searcher.searchMatrix(matrix, 3)); // Output: true
        System.out.println(searcher.searchMatrix(matrix, 13)); // Output: false
    }
}
