package templetemethod.pattern01;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class T850 {
    private static final String NAME = "T850";

    private Order order;

    public T850(Order order) {
        this.order = order;
    }

    public void executeOrder() {
        System.out.println(NAME + " 准备执行指令");
        if (order != null) {
            order.execute();
            return;
        }
        System.out.println("没有接收到行动指令");
    }
}
