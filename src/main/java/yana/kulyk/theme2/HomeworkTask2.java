package yana.kulyk.theme2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask2 {
    public static void main(String[] args) throws IOException {
//       Написать программу, которая по номеру месяца определяет время
//        года (зима, весна, лето, осень) и вывести на экран.
//        Если число меньше 1 и больше 12, то вывести “Нет такого времени
//        года”
//        Например, если введенное число = 1, то нужно вывести “зима”
//        Например, если введенное число = 3, то нужно вывести “весна”

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        switch (Integer.valueOf(input)) {
            case 12:;
            case 1:;
            case 2:
                System.out.println("Зима");
                break;
            case 3:;
            case 4:;
            case 5:
                System.out.println("Весна");
                break;
            case 6:;
            case 7:;
            case 8:
                System.out.println("Лето");
                break;
            case 9:;
            case 10:;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}
