package yana.kulyk.theme4;

public class Task1 {
    public static void main(String[] args) {
        div(10, 5);
        div(2, 0);
        div(9, 3);
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero");
        } else {
            int x = a / b;
            System.out.println(x);
        }
    }

}
//параметры метода - int a , int b
//возвращаемое значение - void
