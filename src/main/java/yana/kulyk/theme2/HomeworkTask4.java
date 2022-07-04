package yana.kulyk.theme2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask4 {
    public static void main(String[] args) throws IOException {

  /*      Если строка соответствует слову “красный”, вывести на
        консоль “Мой любимый цвет - красный”
        Если строка соответствует слову оранжевый, вывести на
        консоль “Мой любимый цвет- оранжевый”
        Если строка соответствует слову желтый, вывести на консоль
“Мой любимый цвет - желтый”
        Если строка соответствует слову зеленый, вывести на консоль
“Мой любимый цвет- зеленый”
        Если строка соответствует слову голубой, вывести на консоль
“Мой любимый цвет - голубой”
        Если строка соответствует слову синий, вывести на консоль
“Мой любимый цвет - синий”
        Если строка соответствует слову фиолетовый, вывести на
        консоль “Мой любимый цвет - фиолетовый”
        Если строка не соответствует ни одному цвету, то вывести “У
        меня нет любимого цвета”
        Решить задачу двумя способами:
        1) с использованием if..else if
        2) с использованием switch-case*/

        var br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.equals("красный")) {
            System.out.println("Мой любимый цвет - красный");
        } else if (input.equals("оранжевый")) {
            System.out.println("Мой любимый цвет - оранжевый");
        } else if (input.equals("желтый")) {
            System.out.println("Мой любимый цвет - желтый");
        } else if (input.equals("зелёный")) {
            System.out.println("Мой любимый цвет - зелёный");

        } else if (input.equals("голубой")) {
            System.out.println("Мой любимый цвет - голубой");
        } else if (input.equals("синий")) {
            System.out.println("Мой любимый цвет - синий");
        } else if (input.equals("фиолетовый")) {
            System.out.println("Мой любимый цвет - фиолетовый");
        } else {
            System.out.println("У меня нет любимого цвета");
        }
        switch (input) {
            case "красный":
                System.out.println("Мой любимый цвет - красный");
                break;
            case "Оранжевый":
                System.out.println("Мой любимый цвет - оранжевый");
                break;
            case "Желтый":
                System.out.println("Мой любимый цвет - желтый");
                break;
            case "зелёный":
                System.out.println("Мой любимый цвет - зелёный");
                break;
            case "голубой":
                System.out.println("Мой любимый цвет - голубой");
                break;
            case "синий":
                System.out.println("Мой любимый цвет - синий");
                break;
            case "фиолетовый":
                System.out.println("Мой любимый цвет - фиолетовый");
                break;
            default:
                System.out.println("У меня нет любимого цвета");
        }
    }

}


