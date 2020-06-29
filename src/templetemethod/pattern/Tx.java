package templetemethod.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class Tx extends Terminator {
    @Override
    protected void start() {
        System.out.println("TX启动");
    }

    @Override
    protected void executeOrder() {
        System.out.println("TX命令被CONNA修改");
    }

    @Override
    protected void stop() {
        System.out.println("TX战死");
    }
}
