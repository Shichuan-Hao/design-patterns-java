package cn.bytewalk.dpj.creational.factorymethod.code0.transports;

/**
 * @author hao shichuan
 * @date 2023/8/27 11:37
 */
public class ShipTransportImpl implements ITransport{
    @Override
    public void deliver() {
        System.out.println("海路运输...轮船交付");
    }
}
