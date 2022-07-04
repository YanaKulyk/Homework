package yana.kulyk.theme4;

public class Task5 {
    public static void hackSalary(int salary) {
        int x = salary + 100;
        System.out.println("Твоя зарплата составляет:" + x + " долларов в месяц ");
    }

    public static void main(String[] args) {
        hackSalary(300);
    }
}
//параметры метода - int x
//возвращаемое значение - void