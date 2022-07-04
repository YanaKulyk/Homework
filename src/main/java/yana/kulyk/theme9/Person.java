package yana.kulyk.theme9;

import java.util.Arrays;

public class Person {
    String name;
    int age;
    boolean isMarried;

    Person() {
        this.name = "Ivan";
        this.age = 30;
        this.isMarried = false;
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getAnniversaries() {
        return this.age / 10;
    }

    public char getFirstLetterOfName() {
        return this.name.charAt(0);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }

    public static void main(String[] args) {
        Person ps1 = new Person();
        Person ps2 = new Person("Sara");
        Person ps3 = new Person("Bob", 39);
        Person ps4 = new Person("Lili", 23, true);

        ps2.setAge(20);

        System.out.println(ps1.getName() + " "
                 + ps1.getAge() + " "
                 + ps1.isMarried());

        System.out.println(ps2.getName() + " "
                + ps2.getAge() +" "
                + ps2.isMarried());
        System.out.println(ps3.getName() + " "
                + ps3.getAge() +" "
                + ps3.isMarried());
        System.out.println(ps4.getName() + " "
                + ps4.getAge() + " "
                + ps4.isMarried());

        Person[] people = new Person[4];
        people[0] = ps1;
        people[1] = ps2;
        people[2] = ps3;
        people[3] = ps4;

        System.out.println(Arrays.toString(people));

        Person method = new Person();
        System.out.println(method.getAnniversaries());
        System.out.println(method.getFirstLetterOfName());

    }
}
