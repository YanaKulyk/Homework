package yana.kulyk.theme3;

public class HomeworkTask4 {

    public static void main(String[] args) {
        int maxAnimals = 5;

        // ================== A
        for (int i = 1; i < 5; i++) {
            System.out.printf("В доме есть %d курица и %d корова", i, maxAnimals - i);
            System.out.println();
        }

        System.out.println("========================================");
        // ================== B
        for (int amountOfChikens = 1; amountOfChikens < 5; amountOfChikens++) {
            int amountOfCows = maxAnimals - amountOfChikens;
            String chiken = null;
            String cow = null;
            if (amountOfChikens > 1) {
                chiken = "курицы";
            } else {
                chiken = "курица";
            }

            if (amountOfCows > 1) {
                cow = "коровы";
            } else {
                cow = "корова";
            }
            System.out.printf("В доме есть %d %s и %d %s", amountOfChikens, chiken, amountOfCows, cow);
            System.out.println();
        }

        System.out.println("========================================");
        // ================== C
        int chikenLegs = 2;
        int cowLegs = 4;
        for (int amountOfChikens = 1; amountOfChikens < 5; amountOfChikens++) {
            int amountOfCows = maxAnimals - amountOfChikens;
            String chiken = null;
            String cow = null;
            if (amountOfChikens > 1) {
                chiken = "курицы";
            } else {
                chiken = "курица";
            }

            if (amountOfCows > 1) {
                cow = "коровы";
            } else {
                cow = "корова";
            }
            int totalLegs = (amountOfChikens * chikenLegs) + (amountOfCows * cowLegs);

            System.out.printf("В доме есть %d %s и %d %s. Количество ног: %d", amountOfChikens,
                    chiken, amountOfCows, cow, totalLegs);
            System.out.println();
        }

    }
}
