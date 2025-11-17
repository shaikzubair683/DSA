package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalinMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int rowStart = 0;
        int rowEnd = m - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // Go Right
            for (int c = colStart; c <= colEnd; c++) {
                result.add(matrix[rowStart][c]);
            }
            rowStart++;

            // Go Down
            for (int r = rowStart; r <= rowEnd; r++) {
                result.add(matrix[r][colEnd]);
            }
            colEnd--;

            // Go Left
            if (rowStart <= rowEnd) {
                for (int c = colEnd; c >= colStart; c--) {
                    result.add(matrix[rowEnd][c]);
                }
                rowEnd--;
            }

            // Go Up
            if (colStart <= colEnd) {
                for (int r = rowEnd; r >= rowStart; r--) {
                    result.add(matrix[r][colStart]);
                }
                colStart++;
            }
        }

        return result;
    }

}
