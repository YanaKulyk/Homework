package yana.kulyk.birds;

public class Demo {

    public static void main(String[] args) {
        Swallow swallow = new Swallow();
        swallow.eat(new Bug());
        swallow.eat(new Grass());
        swallow.fly();

        Swan swan = new Swan();
        swan.eat(new Bug());
        swan.eat(new Grass());
        swan.fly();
        swan.swimm();

        Platypus platypus = new Platypus();
        platypus.eat(new Bug());
        platypus.eat(new Grass());
        platypus.swimm();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swimm();
        System.out.println(rubberDuck.toString());
    }
}
