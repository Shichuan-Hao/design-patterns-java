package cn.bytewalk.dpj.strategy;

import java.text.MessageFormat;

/**
 * @author: haoshichuan
 * @date: 2023/8/18 15:19
 */
public class CarStrategy implements Strategy {


    /**
     *
     * @param home home
     * @param company company
     * @return 返回交通方式 car
     */
    @Override
    public String selectTransportation(String home, String company) {
        String format = MessageFormat.format("家在-{0}, 公司在-{1}，安全带已系好，秋名山车神准备出发啦！", home, company);
        System.out.println(format);
        return "Car";
    }
}
