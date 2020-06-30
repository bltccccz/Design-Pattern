package strategy.pattern;

import strategy.obj.Commodity;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Cut100 extends CutSale {
    public Cut100(Commodity commodity) {
        super(commodity);
    }

    @Override
    public double cutDown() {
        return getCommodity().getPrice();
    }
}
