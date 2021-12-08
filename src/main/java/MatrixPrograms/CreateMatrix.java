package MatrixPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows of Matrix : ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns of Matrix : ");
        int columns = scanner.nextInt();

        System.out.println("Enter matrix data : ");
        int[][] matrix = new int[rows][columns];
        for ( int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Printing matrix using normal for loop");
        for ( int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Using advanced for loop
        System.out.println("Printing matrix using advanced for loop");
        for (int[] matrixRow : matrix) {
            for (int matrixColumn : matrixRow) {
                System.out.print(matrixColumn + " ");
            }
            System.out.println();
        }

        //Using advanced for loop Arrays.toString method
        System.out.println("Printing matrix using advanced for loop Arrays.toString() method");
        for (int[] matrixRow : matrix) {
            System.out.println(Arrays.toString(matrixRow));
        }

        //Using Stream api
        System.out.println("Printing matrix using java stream api");
        Arrays.stream(matrix).forEach( r -> {
            Arrays.stream(r).forEach(c -> System.out.print(c + " "));
            System.out.println();
        });
    }
}
