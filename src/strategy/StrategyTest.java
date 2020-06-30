package strategy;

import strategy.obj.Commodity;
import strategy.pattern.Cut100;
import strategy.pattern.Cut50;
import strategy.pattern.Cut75;
import strategy.pattern.CutContext;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description <p>
 * 根据不同情况制定不同的返回结果，Enum也可以实现策略模式{@link command.pattern.Order}
 * 在springframework中还可以使用注解的形式实现策略模式(详情百度)
 * </p>
 */
public class StrategyTest {
    public static void main(String[] args) {
        //商品价值100
        Commodity commodity = new Commodity(100);

        int price = commodity.getPrice();
        //现在要打75折
        double v = commodity.getPrice() * 0.75;
        //打5折
        double v1 = commodity.getPrice() * 0.5;

        System.out.println("不打折: " + price);
        System.out.println("75折: " + v);
        System.out.println("5折: " + v1);

        System.out.println("================");

        //策略模式打折处理
        System.out.println("不打折: " + strategy(0, commodity));
        System.out.println("75折: " + strategy(2, commodity));
        System.out.println("5折: " + strategy(1, commodity));


        System.out.println("================");

        //Context方式
        System.out.println("不打折: " + new CutContext(new Cut100(commodity)).getPrice());
        System.out.println("75折: " + new CutContext(new Cut75(commodity)).getPrice());
        System.out.println("5折: " + new CutContext(new Cut50(commodity)).getPrice());

    }

    private static double strategy(int type, Commodity commodity) {
        switch (type) {
            case 1:
                return new Cut50(commodity).cutDown();
            case 2:
                return new Cut75(commodity).cutDown();
            default:
                return new Cut100(commodity).cutDown();
        }
    }
}
