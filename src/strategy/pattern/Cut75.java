package strategy.pattern;

import strategy.obj.Commodity;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Cut75 extends CutSale {
    public Cut75(Commodity commodity) {
        super(commodity);
    }

    @Override
    public double cutDown() {
        return getCommodity().getPrice() * 0.75;
    }
}
