package decorator.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Mother {
    private Vegetables bought;

    private Vegetables forSale;

    private boolean thinkFresh = true;

    private int thinkPrice = 10;

    private int thinkWeight = 5;

    public Mother(Vegetables bought) {
        this.bought = bought;
    }

    public void setForSale(Vegetables forSale) {
        this.forSale = forSale;
    }

    public void motherSay() {
        if (checkFresh() && checkPrice() && checkWeight()) {
            System.out.println("干得不错");
        } else if (!checkFresh() && !checkPrice() && !checkWeight()) {
            System.out.println("死远点！败家子!");
        } else {
            System.out.println("哎！还能接受吧");
        }
    }

    private boolean checkFresh() {
        if (this.forSale == null) {
            return this.bought.isFresh();
        } else {
            if (this.bought.isFresh() == false && this.forSale.isFresh() == true) {
                return false;
            }
        }
        return true;
    }

    private boolean checkPrice() {
        if (this.forSale == null) {
            if (this.bought.getPrice() > this.thinkPrice) {
                return false;
            }
        } else {
            if (this.bought.getPrice() > this.forSale.getPrice()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkWeight() {
        if (this.forSale == null) {
            if (this.bought.getWeight() < this.thinkWeight) {
                return false;
            }
        } else {
            if (this.bought.getWeight() < this.forSale.getWeight()) {
                return false;
            }
        }
        return true;
    }
}
