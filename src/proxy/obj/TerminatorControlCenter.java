package proxy.obj;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class TerminatorControlCenter implements ITerminatorControlCenter {
    private String order;

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public void login(String un, String pd) {
        System.out.println(un + " 使用 " + pd + " 登录");
    }

    @Override
    public void executeOrder() {
        System.out.println(order);
    }
}
