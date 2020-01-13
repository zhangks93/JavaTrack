
class Matrix {

    int[][] matrix;
    int[][] matrix_reversed;

    Matrix(String matrixAsString) {
        String[] splited = matrixAsString.split("\n");
        int row = splited.length;
        int col = splited[0].split(" ").length;
        matrix = new int[row][col];
        matrix_reversed = new int[col][row];

        for (int i = 0 ; i < row; i++) {
            String[] units = splited[i].split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = matrix_reversed[j][i] = Integer.parseInt(units[j]);

            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        return matrix_reversed[columnNumber-1];
    }
}
