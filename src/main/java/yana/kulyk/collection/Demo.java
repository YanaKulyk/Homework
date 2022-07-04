package yana.kulyk.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Set<Pet> set = new HashSet<>();
        set.add(new Cat1("Cat1"));
        set.add(new Cat1("Cat2"));
        set.add(new Cat1("Cat3"));

        set.add(new Dog1("Dog1"));
        set.add(new Dog1("Dog2"));
        set.add(new Dog1("Dog3"));

        Iterator<Pet> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
