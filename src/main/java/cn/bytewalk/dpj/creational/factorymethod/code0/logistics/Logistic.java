package cn.bytewalk.dpj.creational.factorymethod.code0.logistics;

import cn.bytewalk.dpj.creational.factorymethod.code0.transports.ITransport;

import java.util.Objects;

/**
 * @author hao shichuan
 * @date 2023/8/27 11:39
 */
public abstract class Logistic {

    public void planDeliver() {
        ITransport transport = createTransport();
        transport.deliver();
    }

    abstract ITransport createTransport();
}
