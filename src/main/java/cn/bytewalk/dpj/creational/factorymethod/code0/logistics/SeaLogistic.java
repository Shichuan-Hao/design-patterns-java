package cn.bytewalk.dpj.creational.factorymethod.code0.logistics;

import cn.bytewalk.dpj.creational.factorymethod.code0.transports.ITransport;
import cn.bytewalk.dpj.creational.factorymethod.code0.transports.ShipTransportImpl;

/**
 * @author hao shichuan
 * @date 2023/8/27 11:41
 */
public class SeaLogistic extends Logistic {

    @Override
    ITransport createTransport() {
        return new ShipTransportImpl();
    }
}
