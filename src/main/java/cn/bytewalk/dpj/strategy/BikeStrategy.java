package cn.bytewalk.dpj.strategy;

import java.text.MessageFormat;

/**
 * @author: haoshichuan
 * @date: 2023/8/18 15:20
 */
public class BikeStrategy implements Strategy{
    /**
     * 选择从家去公司的交通方式
     *
     * @param home    家
     * @param company 公司
     * @return 交通方式
     */
    public String selectTransportation(String home, String company) {
        String format = MessageFormat.format("家在-{0}, 公司在-{1}，绿色出行，为环保贡献一份力量！", home, company);
        System.out.println(format);
        return "Bike";
    }
}
