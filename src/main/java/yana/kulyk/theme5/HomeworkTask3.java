package yana.kulyk.theme5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask3 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array length:");
        int arrayLength = Integer.parseInt(br.readLine());
        int[] arr = new int[arrayLength];

        System.out.println("Enter array values:");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }

        System.out.println(findMinInArray(arr));
    }

    private static int findMinInArray(int[] arr) {
        int min = arr[0];
        for (int i : arr ) {
            min = Math.min(min, i);
        }
        return min;
    }
















//    public static int Array(int ar[]) {
//        int min = ar[0];
//        for (int i = 1; i < ar.length; i++) {
//            if (ar[i] < min) {
//                min = ar[i];
//            }
//            return min;
//        }
//    }
}
