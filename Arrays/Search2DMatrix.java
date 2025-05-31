package arrays;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols - 1;

        while(row < rows && col >= 0){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) col--;
            else row++;
        }

        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix searcher = new Search2DMatrix();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
            {60, 61, 62, 63}
        };
        int target = 3;
        boolean found = searcher.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }
}
