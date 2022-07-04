package yana.kulyk.birds;

import java.util.Objects;

public class Swan extends Bird implements Swimmable, Flyable, Animal, CreatureWithBeak {
    private Beak beak;


    @Override
    public void eat(Food grass) {
        if (grass instanceof Grass) {
            System.out.println("I eat grass");
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
    public void swimm() {
        System.out.println("I can swim");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swan swan = (Swan) o;
        return Objects.equals(beak, swan.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beak);
    }

    @Override
    public String toString() {
        return "Swan{" +
                "beak=" + beak +
                '}';
    }
}
