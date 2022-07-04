package yana.kulyk.com.company.vehicles;

import yana.kulyk.ChecklistUrl;
import yana.kulyk.com.company.details.Engine;
import yana.kulyk.com.company.professions.Driver;

public class SportCar extends Car{
private double speed;
public SportCar(String marka, String carClass, double weight, Driver driver, Engine engine,double speed){
    super(marka, carClass, weight, driver, engine);
    this.setSpeed(speed);
}

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
