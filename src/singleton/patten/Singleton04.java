package singleton.patten;

import singleton.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description double-check方式,多线程下也能取得单一对象，读不需要获取锁，对效率有一定优化，但是多线程下有可能发生 NullPointException
 */
public final class Singleton04 {

    private Singleton04() {

    }

    /**
     * 关键字volatile可以解决NullPointException
     * <p>
     * 出现异常的原因：类的初始化需要时间，当一个线程执行到②,machine对象已经产生，但是初始化并未完成；此时第二个线程执行到
     * ①，判断后不为空取走该对象，则在使用对象时可能产生NullPointException。
     * <p>
     * volatile关键字能够在读之前保证初始化的完成(Happen Before原则)
     */
    private volatile static Machine machine;

    public static Machine instance() {
        //①
        if (machine == null) {
            synchronized (Singleton04.class) {
                if (machine == null) {
                    //②
                    machine = new Machine();
                }
            }
        }

        return machine;
    }
}
