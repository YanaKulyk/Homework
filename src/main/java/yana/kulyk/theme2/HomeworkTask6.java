package yana.kulyk.theme2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask6 {
    public static void main(String[] args) throws IOException {

        var br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();
        int a = Integer.valueOf(input);
        int b = Integer.valueOf(input2);
        int c = Integer.valueOf(input3);
        int sum1 = b + c;
        int sum2 = c + a;
        int sum3 = b + a;

        if (a < sum1 && b < sum2 && c < sum3){
            System.out.println("Треугольник существует");
        } else{
            System.out.println("Треугольник не существует");
        }


    }
}
