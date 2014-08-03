package core.Sorting;

import java.util.Arrays;

public class Main {

    int[] arr = {10};

    public static void main(String[] args) {
        int[] dataSrc = {0, 3, 3, 5, 6, 7, 12, 13, 22};

//        int[] dataDest = {0, 0, 4, 9, 10, 17, 22, 113, 150};

        int temp;

        int barrier;

        for (barrier = dataSrc.length; barrier >= 0; barrier--) {

            for (int i = 0; i < dataSrc.length - 1; i++) {

                if (dataSrc[i] > dataSrc[i + 1]) {

                    temp = dataSrc[i];

                    dataSrc[i] = dataSrc[i + 1];
                    dataSrc[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(dataSrc));
    }
}