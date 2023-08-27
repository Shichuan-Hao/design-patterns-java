package cn.bytewalk.dpj.creational.factorymethod.code0.transports;

/**
 * @author hao shichuan
 * @date 2023/8/27 11:36
 */
public class TruckTransportImpl implements ITransport{
    @Override
    public void deliver() {
        System.out.println("卡车...陆路运输交付...");
    }
}
