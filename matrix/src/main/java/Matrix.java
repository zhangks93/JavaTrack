
class Matrix {

    int[][] matrix;

    Matrix(String matrixAsString) {
        String[] splited = matrixAsString.split("\n");
        int row = splited.length;
        int col = splited[0].split(" ").length;
        matrix = new int[row][col];

        for (int i = 0 ; i < row; i++) {
            String[] units = splited[i].split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(units[j]);
                System.out.println(matrix[i][j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < result.length; i++){
            result[i] = matrix[i][columnNumber-1];
        }
        return result;
    }
}
