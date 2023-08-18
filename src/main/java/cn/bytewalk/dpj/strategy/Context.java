package cn.bytewalk.dpj.strategy;

/**
 * 上下文
 * @author: haoshichuan
 * @date: 2023/8/18 15:25
 */
public class Context {

    /**
     * 策略
     */
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 选择去公司的交通方式
     *
     * @param home home
     * @param company company
     * @return 返回交通方式
     */
    public String selectTransToCompany(String home, String company) {
        return strategy.selectTransportation(home, company);
    }

}
