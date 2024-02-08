public class matrixMultiplication {
    public static void main(String[] args) {
        // Define matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Multiply the matrices
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

         // Display the result
        System.out.println("\nProduct of the matrices:");
        displayMatrix(productMatrix);
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        // Check if matrices can be multiplied
        if (columns1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Invalid dimensions.");
            return null;
        }

        int[][] productMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return productMatrix;
    }

    // Method to display a matrix
    private static void displayMatrix(int matrix[][]) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
