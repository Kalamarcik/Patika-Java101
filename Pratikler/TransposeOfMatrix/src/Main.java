import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of colunns: ");
        int columns = scan.nextInt();

        int[][] matrix = new int[rows][columns];


        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("MATRIX:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int tRows = matrix.length;
        int tColumns = matrix[0].length;

        int[][] transpose = new int[tColumns][tRows];

        for(int i=0; i<transpose.length; i++) {
            for(int j=0; j<transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("TRANSPOSE:");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}