package yana.kulyk.candies;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sweet sweet1 = new Candy("Rafaello", 2);
        Sweet sweet2 = new Candy("Ferero", 4);
        Sweet sweet3 = new Cookie("Oreo",1.5);
        Sweet sweet4 = new Cookie("Chocolad",4);
        Sweet sweet5 = new Candy("Lastochka", 3.5);


        Sweet[] sweets = {sweet1, sweet2, sweet3, sweet4, sweet5};
        Sweet[] sweets2 = new Sweet[Sweet.getCounter()];
        sweets2[0] = sweet1;
        sweets2[1] = sweet2;
        sweets2[2] = sweet3;
        sweets2[3] = sweet4;
        sweets2[4] = sweet5;

        System.out.println(sumWeight(sweets));

    }
    public static double sumWeight(Sweet[] sweets) {
        double weight = 0;
        for (Sweet sweet : sweets) {
            weight += sweet.getWeight();
        }
        return weight;
    }

}

