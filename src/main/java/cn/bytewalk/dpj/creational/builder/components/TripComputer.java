package cn.bytewalk.dpj.creational.builder.components;

import cn.bytewalk.dpj.creational.builder.cars.Car;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 16:55
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
