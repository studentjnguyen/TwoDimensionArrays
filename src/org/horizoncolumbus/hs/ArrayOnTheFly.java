package org.horizoncolumbus.hs;

import java.util.Scanner;

public class ArrayOnTheFly {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Row size: ");
        int rowSize = input.nextInt();
        System.out.print("Please enter Column size: ");
        int columnSize = input.nextInt();
        int[][] matrix = new int[rowSize][columnSize];

        for(int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print("Enter Row " + (i+1) + " Column " + (j+1) + " data: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
