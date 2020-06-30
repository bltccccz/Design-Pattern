package mediator.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class HouseSeller implements Seller {

    private int housePrice;

    private HouseType type;

    public HouseSeller(int housePrice, HouseType type) {
        this.housePrice = housePrice;
        this.type = type;
    }

    @Override
    public void detail() {
        System.out.println("这房是 " + this.type.name() + ", 我要卖 " + this.housePrice + "!");
    }
}
