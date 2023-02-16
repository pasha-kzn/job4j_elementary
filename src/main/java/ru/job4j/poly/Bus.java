package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Катится автобус по вечернему городу");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("В автобусе едет " + passengers + " пассажиров");
    }

    @Override
    public int refuel(int liters) {
        return 45 * liters;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по скоростным трассам");
    }
}
