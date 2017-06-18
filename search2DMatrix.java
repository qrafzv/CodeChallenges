public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0 || matrix[0].length==0)
            return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols-1;
        while (row < rows && col >= 0)
        {
            if (matrix[row][col]==target)
                return true;
            else if ( target > matrix[row][col])
            {
                row++;
            }
            else
                col--;
        }
        
        return false;
        
    }
}
