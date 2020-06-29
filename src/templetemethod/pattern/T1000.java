package templetemethod.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class T1000 extends Terminator {
    @Override
    protected void start() {
        System.out.println("T1000启动");
    }

    @Override
    protected void executeOrder() {
        System.out.println("T1000执行命令");
    }

    @Override
    protected void stop() {
        System.out.println("T1000没电了");
    }
}
