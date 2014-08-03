package core.matrixMultiplication;

import java.util.Arrays;

public class MatrixMultiplication {

    private int counterAForY = 0;

    private int counterBForX = 0;

    int counterForDestX = 0;
    int counterForDestY = 0;

    public void matrixMultiplicator(int matrixA[][], int matrixB[][]) {

        int matrixResult[][] = new int[matrixA.length][matrixB[0].length];

        for (; counterForDestX < matrixA.length; counterForDestX++) {

            for (; counterForDestY < matrixB[0].length; counterForDestY++) {

                for (int index = 0; index < matrixB[0].length; index++) {

                    matrixResult[counterForDestX][counterForDestY] += matrixA[counterForDestX][counterAForY + index] * matrixB[counterBForX + index][counterForDestY];

                }

            }

            counterForDestY = 0;

        }

        System.out.println("Result's array is: ");

        for (int arrays = 0; arrays < matrixResult.length; arrays++) {
            System.out.println(Arrays.toString(matrixResult[arrays]));
        }

    }


    public static void main(String[] args) {

        int arrayA[][] = {
                {1, 0, 0},
                {0, 3, 0},
                {0, 2, 0},
                {0, 0, 0}
        };

        int arrayB[][] = {
                {0, 2, 0},
                {0, 1, 0},
                {0, 1, 0}
        };

        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();

        matrixMultiplication.matrixMultiplicator(arrayA, arrayB);

    }

}
