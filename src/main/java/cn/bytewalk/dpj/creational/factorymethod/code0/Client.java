package cn.bytewalk.dpj.creational.factorymethod.code0;

import cn.bytewalk.dpj.creational.factorymethod.code0.logistics.Logistic;
import cn.bytewalk.dpj.creational.factorymethod.code0.logistics.LogisticType;
import cn.bytewalk.dpj.creational.factorymethod.code0.logistics.RoadLogistic;
import cn.bytewalk.dpj.creational.factorymethod.code0.logistics.SeaLogistic;

import java.util.Objects;

/**
 * @author hao shichuan
 * @date 2023/8/27 11:45
 */
public class Client {


    static Logistic logistic;

    public static void main(String[] args) {
        configure("sea");
        System.out.println();
        System.out.println();
        configure("road");
    }

    public static void configure(String type) {
        Objects.requireNonNull(type, "The type of logistic is not null.");
        if (Objects.equals(LogisticType.SEA.name().toLowerCase(), type)) {
            logistic = new SeaLogistic();
        } else if (Objects.equals(LogisticType.ROAD.name().toLowerCase(), type)) {
            logistic = new RoadLogistic();
        } else {
            throw new IllegalArgumentException("type 未知");
        }
        logistic.planDeliver();
    }
}
