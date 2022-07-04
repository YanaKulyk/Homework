package yana.kulyk.theme3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while (true) {
            String input = br.readLine();
            int i = Integer.valueOf(input);
            result += i;
            if (input.equals("-1")) {
                break;
            }
        }
        System.out.println(result);

    }
}
