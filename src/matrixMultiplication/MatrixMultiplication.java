package matrixMultiplication;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class MatrixMultiplication {

    private int counterAForX = 0;
    private int counterAForY = 0;

    private int counterBForX = 0;
    private int counterBForY = 0;

    int counterForDestX = 0;
    int counterForDestY = 0;

    public int[] matrixMultiplicator(int matrixA[][], int matrixB[][]) {

        int matrixResult[][] = new int[matrixA.length][matrixB[0].length];

        for (; counterForDestX < matrixA.length; counterForDestX++, counterAForX++) {

            for (; counterForDestY < matrixB[0].length; counterForDestY++, counterBForY++) {

                for (int i = 0; i < matrixB[0].length; i++) {

                    matrixResult[counterForDestX][counterForDestY] += matrixA[counterForDestX][counterAForY + i] * matrixB[counterBForX + i][counterForDestY];

                }

            }

            counterBForY = 0;

            counterForDestY = 0;

        }

        System.out.println("matrixResult[0] " + Arrays.toString(matrixResult[0]));
        System.out.println("matrixResult[1] " + Arrays.toString(matrixResult[1]));
        System.out.println("matrixResult[2] " + Arrays.toString(matrixResult[2]));
        System.out.println("matrixResult[3] " + Arrays.toString(matrixResult[3]));

        return matrixResult[0];
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

        Arrays.toString(matrixMultiplication.matrixMultiplicator(arrayA, arrayB));

    }

}
