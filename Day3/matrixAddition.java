public class matrixAddition {
    public static void main(String[] args) {
        // Define matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Add the matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nSum of the matrices:");
        displayMatrix(sumMatrix);
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
