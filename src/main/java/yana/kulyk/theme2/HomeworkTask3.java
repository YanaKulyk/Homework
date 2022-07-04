package yana.kulyk.theme2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask3 {
    public static void main(String[] args) throws IOException {
 /*       Если число положительное, то увеличить его в два раза.
                Если число отрицательное, то прибавить единицу.
        Если введенное число равно нулю, необходимо вывести ноль.
        В конце программа должна напечатать “DONE”
        Вывести результат на экран в формате:
“Введенное число: 5”
“Число после преобразований: 10”
“DONE”*/
        var br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int a = Integer.valueOf(input);
        int result = a;
        if (a > 0) {
            result *= 2;
        }
        if (a < 0) {
            result += 1;
        }
        System.out.println("Введенное число: " + a);
        System.out.println("Число после преобразований: " + result);
        System.out.println("DONE");
    }
}
