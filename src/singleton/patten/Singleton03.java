package singleton.patten;

import singleton.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description 使用this锁保证多线程下单一对象，但是无论读写都需要获取锁，一定程度影响效率
 */
public final class Singleton03 {

    private static Machine machine;

    private Singleton03() {

    }

    public synchronized static Machine instance() {
        if (machine == null) {
            machine = new Machine();
        }

        return machine;
    }
}
