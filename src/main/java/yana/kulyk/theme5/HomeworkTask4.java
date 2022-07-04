package yana.kulyk.theme5;

import java.util.Arrays;
import java.util.Collections;

public class HomeworkTask4 {
    public static void main(String[] args) {
        int[] mas = {3, 12, 88, 7, 27};
        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(bubbleSortDesc(mas)));
        System.out.println(Arrays.toString(bubbleSortDescForEach(mas)));

        Integer[] arr = {3, 12, 88, 7, 27};
        bubbleSortDescWithArraysClass(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSortDescWithArraysClass(Integer[] mas) {
        Arrays.sort(mas, Collections.reverseOrder());
    }

    public static int[] bubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortDescForEach(int[] arr) {
        int counter = 0;
        for (int element : arr) {
            for (int j = 1; j < (arr.length - counter); j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }


        return arr;
    }

}
