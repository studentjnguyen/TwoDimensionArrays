package org.horizoncolumbus.hs;

public class SumOfMatrix {

    public static void main(String[] args) {
	// write your code here
        int[][] matrix = {{0,1,1},{9,2,4},{9,0,4},{1,2,5}};

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 1; j++){
                System.out.print(matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]);
            }
            System.out.println();
        }

    }
}
