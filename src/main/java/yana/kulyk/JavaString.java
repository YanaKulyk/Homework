package yana.kulyk;

public class JavaString {
    public static void main(String[] args) {

        System.out.println("It's Java string:");
        System.out.println("\"AQAcourse\\lecture_2\\src\\main\\java\\Homewor\\Task1.java\"\n");

        System.out.println("It's Java string:" + System.lineSeparator() + "\"AQAcourse\\lecture_2\\src\\main\\java\\Homewor\\Task1.java\"\n");

        String s = "It's Java string:" + System.lineSeparator() + "\"AQAcourse\\lecture_2\\src\\main\\java\\Homewor\\Task1.java\"\n";
        System.out.println(s);

    }

}
