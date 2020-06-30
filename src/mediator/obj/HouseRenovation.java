package mediator.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class HouseRenovation implements Seller {
    private HouseType type;

    private int renovationPrice;

    public HouseRenovation(HouseType type, int renovationPrice) {
        this.type = type;
        this.renovationPrice = renovationPrice;
    }

    @Override
    public void detail() {
        System.out.println("这个 " + this.type.name() + " 装修我要收 " + this.renovationPrice);
    }
}
