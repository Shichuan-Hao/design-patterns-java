package cn.bytewalk.dpj.creational.builder.builders;

import cn.bytewalk.dpj.creational.builder.cars.CarType;
import cn.bytewalk.dpj.creational.builder.components.Engine;
import cn.bytewalk.dpj.creational.builder.components.GPSNavigator;
import cn.bytewalk.dpj.creational.builder.components.Transmission;
import cn.bytewalk.dpj.creational.builder.components.TripComputer;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 16:44
 *
 * 通用生成器接口
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);


}
