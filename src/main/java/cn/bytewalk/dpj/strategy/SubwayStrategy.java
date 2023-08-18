package cn.bytewalk.dpj.strategy;

import java.text.MessageFormat;

/**
 * @author: haoshichuan
 * @date: 2023/8/18 14:21
 */
public class SubwayStrategy implements Strategy{

    /**
     * 选择
     * @param home home
     * @param company company
     * @return 返回交通工具
     */
    @Override
    public String selectTransportation(String home, String company) {
        String format = MessageFormat.format("家在-{0}, 公司在-{1}，建议您乘坐地铁出行！", home, company);
        System.out.println(format);
        return "Subway";
    }
}
