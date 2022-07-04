package yana.kulyk.com.company.vehicles;

import yana.kulyk.com.company.details.Engine;
import yana.kulyk.com.company.professions.Driver;

public class Lorry extends Car{
    private double carrying;

    public Lorry(String marka, String carClass, double weight, Driver driver, Engine engine, double carrying){
        super(marka, carClass, weight, driver, engine);
        this.setCarrying(carrying);

    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

}
