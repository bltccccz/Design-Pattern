package strategy.pattern;

import strategy.obj.Commodity;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public abstract class CutSale {
    private final Commodity commodity;

    public CutSale(Commodity commodity) {
        this.commodity = commodity;
    }

    protected Commodity getCommodity() {
        return commodity;
    }

    public abstract double cutDown();
}
