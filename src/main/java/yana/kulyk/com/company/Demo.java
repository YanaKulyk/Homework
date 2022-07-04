package yana.kulyk.com.company;

import yana.kulyk.com.company.details.Engine;
import yana.kulyk.com.company.professions.Driver;
import yana.kulyk.com.company.vehicles.Car;
import yana.kulyk.com.company.vehicles.Lorry;
import yana.kulyk.com.company.vehicles.SportCar;

public class Demo {
    public static void main(String[] args) {
        Driver opelDriver = new Driver("Максимченко А.Ю.", 38, 4);
        Engine opelEngine = new Engine("90", "OPEL");
        Car car = new Car("Opel", "C", 6000, opelDriver, opelEngine);

        Driver lorryDriver = new Driver("Симоненко В.В.", 59, 8);
        Engine lorryEngine = new Engine("100","Kamaz");
        Lorry lorry = new Lorry("BMW","A",4500, lorryDriver, lorryEngine, 8.9);

        Driver sportCarDriver = new Driver("Зайцев К.О.", 26, 5);
        Engine sportCarEngine = new Engine("200","Lotus");
        SportCar sportCar = new SportCar("Ferrari","A",5.8, sportCarDriver,sportCarEngine, 80);

        car.printInfo();
        car.turnLeft();
        car.turnRight();
        car.start();
        car.stop();

        System.out.println(lorry);
        System.out.println(sportCar);

    }
}
