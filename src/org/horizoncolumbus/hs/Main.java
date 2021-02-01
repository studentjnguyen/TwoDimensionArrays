package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

        int[][] arr2 = new int[3][3];
        arr2[0][0] = 1;
        arr2[0][1] = 5;
        arr2[0][2] = 8;

        arr2[1][0] = 4;
        arr2[1][1] = 0;
        arr2[1][2] = 8;

        arr2[2][0] = 3;
        arr2[2][1] = 7;
        arr2[2][2] = 4;

        for(int i = 0; i < 3; i++){
            for(int i1 = 0; i1 < 3; i1++){
                System.out.print(arr[i][i1] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        for(int i = 0; i < 3; i++){
            for(int i1 = 0; i1 < 3; i1++){
                System.out.print(arr2[i][i1] + " ");
            }
            System.out.println();
        }

    }
}
