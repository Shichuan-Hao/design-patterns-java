package cn.bytewalk.dpj.strategy;

/**
 * @author: haoshichuan
 * @date: 2023/8/18 15:26
 */
public class Test {
    public static void main(String[] args) {
        Context strategyContext = new Context(new SubwayStrategy());
        String trans = strategyContext.selectTransToCompany("京杭大运河", "未来科技城");
        System.out.println(trans);

        strategyContext = new Context(new CarStrategy());
        trans = strategyContext.selectTransToCompany("老余杭", "未来科技城");
        System.out.println(trans);

        strategyContext = new Context(new BikeStrategy());
        trans = strategyContext.selectTransToCompany("未来科技城", "未来科技城");
        System.out.println(trans);
    }
}
