package ru.job4j.polymorph;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        townCar.refill();
        townCar.chargeBattery();
        Vehicle.getDragCoefficient();
        System.out.println();
        TownCar townCar1 = new TownCar();
        townCar1.changeGear();
        townCar1.accelerate();
        townCar1.steer();
        townCar1.brake();
        townCar.refill();
        System.out.println();
        SportCar sportCar = new SportCar();
        //Vehicle vehicle = sportCar;
        //Fuel fuel = sportCar;
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();
    }
}