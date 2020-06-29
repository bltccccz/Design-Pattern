package builder.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class Terminator {

    private String type;

    private String order;

    public void setOrder(String order) {
        this.order = order;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void executeOrder() {
        System.out.println(this.order);
    }
}
