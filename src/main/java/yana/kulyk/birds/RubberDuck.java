package yana.kulyk.birds;

import java.util.Objects;

public class RubberDuck extends Bird implements Swimmable, CreatureWithBeak{
    String material = "Rubber";
private Beak beak;
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
        RubberDuck that = (RubberDuck) o;
        return Objects.equals(material, that.material) && Objects.equals(beak, that.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, beak);
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "material='" + material + '\'' +
                ", beak=" + beak +
                '}';
    }
}
