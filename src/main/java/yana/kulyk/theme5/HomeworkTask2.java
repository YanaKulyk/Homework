package yana.kulyk.theme5;

import java.util.Arrays;

public class HomeworkTask2 {

    public static void main(String[] args) {
        int myArray[] = {3, 6, 9, 17};
        System.out.println(findElementsBetweenMinAndMax(myArray));
        System.out.println(calculateAverageInArray(myArray));
        System.out.println(calculateArraySum(myArray));
    }

    public static double calculateArraySum(int[] arr) {

        return Arrays.stream(arr).sum();
    }

    public static double calculateAverageInArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        return sum / arr.length;
    }

    public static int findElementsBetweenMinAndMax(int[] arr) {
        int minElementIndex = 0;
        int maxElementIndex = 0;

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - min < 0) {
                min = arr[i];
                minElementIndex = i;
            }
            if (arr[i] - max > 0) {
                max = arr[i];
                maxElementIndex = i;
            }
        }

        return Math.abs(minElementIndex - maxElementIndex) - 1;
    }


}
