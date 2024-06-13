/******************************************************
 * Kean University - Summer 2024 *
 * Midterm Exam *
 * Author: Anthony Dominguez
 * Course /section: CPS 2231-16*
 *******************************************************/
import java.util.*;

public class Matrix{

    // Random into the Matrix
    public static int[][] matrixSetUp(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        return matrix;
    }
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Methods to print Transpose
    public static int[][] matrixTranspose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return  transpose;
    }
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide two integers from 2 to 10, separated by spaces: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
//      2D array
        int[][] matrix = matrixSetUp(rows, cols);
        System.out.println("Initial Matrix: ");
//      printing matrix
        printMatrix(matrix);
//      matrix to tranpose method
        int[][] tranposed = matrixTranspose(matrix);
        System.out.println("Transposed Matrix: ");
//      printing tranposed
        printMatrix(tranposed);

    }
}
