package yana.kulyk.birds;

import java.util.Objects;

public class Platypus extends Mammal implements Swimmable, Animal, CreatureWithBeak {
 private Beak beak;
    @Override
    public void eat(Food food) {
        if (food instanceof Bug) {
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
    public void swimm() {
        System.out.println("I can swim");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platypus platypus = (Platypus) o;
        return Objects.equals(beak, platypus.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beak);
    }

    @Override
    public String toString() {
        return "Platypus{" +
                "beak=" + beak +
                '}';
    }
}
