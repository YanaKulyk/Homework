package yana.kulyk.theme3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask3 {
    public static void main(String[] args) throws IOException {
        int m = 2;
        int n = 4;

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(8);
            }
            System.out.println();
        }
        // =======================================
        var br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        m = Integer.valueOf(input);
        n = Integer.valueOf(input2);
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
