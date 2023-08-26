package cn.bytewalk.dpj.creational.builder.director;

import cn.bytewalk.dpj.creational.builder.builders.Builder;
import cn.bytewalk.dpj.creational.builder.cars.CarType;
import cn.bytewalk.dpj.creational.builder.components.Engine;
import cn.bytewalk.dpj.creational.builder.components.GPSNavigator;
import cn.bytewalk.dpj.creational.builder.components.Transmission;
import cn.bytewalk.dpj.creational.builder.components.TripComputer;

/**
 * \
 *
 * @author: haoshichuan
 * @date: 2023/8/26 17:00
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
