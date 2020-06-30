package strategy.pattern;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class CutContext {
    private CutSale cutSale;

    public CutContext(CutSale cutSale) {
        this.cutSale = cutSale;
    }

    public double getPrice() {
        return cutSale.cutDown();
    }
}
