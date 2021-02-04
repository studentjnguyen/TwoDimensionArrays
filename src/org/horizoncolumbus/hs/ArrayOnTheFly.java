package org.horizoncolumbus.hs;

import java.util.Scanner;

public class ArrayOnTheFly {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Column size: ");
        int columnSize = input.nextInt();
        System.out.print("Please enter Row size: ");
        int rowSize = input.nextInt();
        int[][] matrix = new int[columnSize][rowSize];

        for(int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print("Enter Column " + i + " Row " + j + " Size: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for(int i = 0; i < columnSize; i++){
            for(int j = 0; j < rowSize; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
