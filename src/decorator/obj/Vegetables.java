package decorator.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Vegetables {
    private final boolean isFresh;

    private final int price;

    private final int weight;

    public Vegetables(boolean isFresh, int price, int weight) {
        this.isFresh = isFresh;
        this.price = price;
        this.weight = weight;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
