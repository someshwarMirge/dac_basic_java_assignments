import java.util.Scanner;

// 10. Write a program to add two matrix of numbers?
public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix 1");
        int row1 = scan.nextInt();
        int col1 = scan.nextInt();
        System.out.println("Enter the number of rows and columns of matrix 2");
        int row2 = scan.nextInt();
        int col2 = scan.nextInt();
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter the elements of matrix 1");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        int[][] matrix3 = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                matrix3[i][j] = 0;
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("The resultant matrix is");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
        }
        
    }
}
