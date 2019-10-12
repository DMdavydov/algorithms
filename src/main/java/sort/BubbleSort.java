package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, -15 , 7, 35, 1, 55, -22};

        for(int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            for(int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

        System.out.println(Arrays.toString(array));


    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
