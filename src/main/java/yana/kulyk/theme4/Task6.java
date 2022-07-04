package yana.kulyk.theme4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int result = a;
        for (int i = 1; i < 5; i++) {
            int userInput = Integer.parseInt(br.readLine());
            result = min(result, userInput);
        }
        System.out.println("Минимум :" + result);

    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

}
