package factory.obj;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public class ZhouXinXin implements Machine {
    @Override
    public void getOutLook() {
        System.out.println("周星驰的样子");
    }

    @Override
    public void executeOrder() {
        System.out.println("保护虫虫");
    }
}
