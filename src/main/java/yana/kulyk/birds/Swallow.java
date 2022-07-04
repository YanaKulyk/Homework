package yana.kulyk.birds;

import java.util.Objects;

public class Swallow extends Bird implements Flyable, Animal, CreatureWithBeak {

    private Beak beak;


    @Override
    public void eat(Food bug) {
        if (bug instanceof Bug) {
            System.out.println("I eat bug");
        } else {
            System.out.println("I don't eat such kind of food");
        }
    }

    @Override
    public Beak getBeak() {
        return this.beak;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swallow swallow = (Swallow) o;
        return Objects.equals(beak, swallow.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beak);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "beak=" + beak +
                '}';
    }
}
