package sortingTwoArrays;

import java.util.Arrays;

public class Main {

    private int length;

    private int counterDest = 0;

    private int counterScr = 0;

    boolean result = false;

    private int[] sortArrays(int arrDest[], int arrScr[]) {

        length = arrDest.length + arrScr.length;

        int fullArray[] = new int[length];

        for (int i = 0; result != true; i++) {

            if (counterDest >= arrDest.length) {

                System.arraycopy(arrScr, counterScr, fullArray, i, fullArray.length - i);

                result = true;

            } else if (counterScr >= arrScr.length) {

                System.arraycopy(arrDest, counterDest, fullArray, i, fullArray.length - i);

                result = true;

            } else if (arrDest[counterDest] < arrScr[counterScr]) {

                fullArray[i] = arrDest[counterDest];

                counterDest++;


            } else if (arrDest[counterDest] >= arrScr[counterScr]) {

                fullArray[i] = arrScr[counterScr];

                counterScr++;

            }

        }

        System.out.println("The new array will be: " + Arrays.toString(fullArray));

        return fullArray;
    }

    public static void main(String[] args) {

        Main main = new Main();

        int arrayDest[] = {1, 1, 3, 4, 5};

        int arrayScr[] = {-1, 0, 2, 4, 5};

        main.sortArrays(arrayDest, arrayScr);

    }

}
