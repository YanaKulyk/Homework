package yana.kulyk.theme4;

public class Task4 {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int j = 0; j < count; j++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Five"));
        System.out.println(multiply("Five", 8));
    }
}
//параметры метода - int count , String s
//возвращаемое значение - String