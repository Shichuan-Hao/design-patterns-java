package cn.bytewalk.dpj.creational.builder.builders;

import cn.bytewalk.dpj.creational.builder.cars.Car;
import cn.bytewalk.dpj.creational.builder.cars.CarType;
import cn.bytewalk.dpj.creational.builder.components.Engine;
import cn.bytewalk.dpj.creational.builder.components.GPSNavigator;
import cn.bytewalk.dpj.creational.builder.components.Transmission;
import cn.bytewalk.dpj.creational.builder.components.TripComputer;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 16:59
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}