package templetemethod.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public abstract class Terminator {

    protected abstract void start();

    protected abstract void executeOrder();

    protected abstract void stop();

    /**
     * 封装每个 终结者 相同的操作
     */
    public void run() {
        this.start();
        this.executeOrder();
        this.stop();
    }
}
