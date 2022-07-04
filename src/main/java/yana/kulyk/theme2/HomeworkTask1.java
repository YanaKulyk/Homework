package yana.kulyk.theme2;

public class HomeworkTask1 {
    public static void main(String[] args) {
        int points = 89;
        if (points < 0) {
            System.out.println("impossible!");
        }
        if (points > 0 && points <= 49) {
            System.out.println("failed");
        }
        if (points >= 50 && points <= 59) {
            System.out.println("1");
        }
        if (points >= 60 && points <= 69) {
            System.out.println("2");
        }
        if (points >= 70 && points <= 79) {
            System.out.println("3");
        }
        if (points >= 80 && points <= 89) {
            System.out.println("4");
        }
        if (points >= 90 && points <= 100) {
            System.out.println("5");
        }
        if (points > 100) {
            System.out.println("incredible!");
        }
    }
}