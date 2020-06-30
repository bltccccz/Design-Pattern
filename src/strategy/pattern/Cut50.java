package strategy.pattern;

import strategy.obj.Commodity;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Cut50 extends CutSale {
    public Cut50(Commodity commodity) {
        super(commodity);
    }

    @Override
    public double cutDown() {
        return getCommodity().getPrice() * 0.5;
    }
}
