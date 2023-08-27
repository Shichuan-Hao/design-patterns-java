package cn.bytewalk.dpj.creational.factorymethod.code0.logistics;

import cn.bytewalk.dpj.creational.factorymethod.code0.transports.ITransport;
import cn.bytewalk.dpj.creational.factorymethod.code0.transports.ShipTransportImpl;
import cn.bytewalk.dpj.creational.factorymethod.code0.transports.TruckTransportImpl;

/**
 * @author hao shichuan
 * @date 2023/8/27 11:40
 */
public class RoadLogistic extends Logistic {
    @Override
    ITransport createTransport() {
        return new TruckTransportImpl();
    }
}
