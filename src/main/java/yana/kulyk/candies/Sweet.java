package yana.kulyk.candies;

public class Sweet {
    private static int counter;

    private String name;
    private double weight;

    {
        counter++;
    }


    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCounter() {
        return counter;
    }
}
