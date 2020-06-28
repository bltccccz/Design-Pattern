package singleton.patten;

import singleton.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description 首次调用时生成单一对象，但是多线程下几乎必定产生多个对象
 */
public final class Singleton02 {

    private static Machine machine;

    private Singleton02() {

    }

    public static Machine instance() {
        if (machine == null) {
            machine = new Machine();
        }

        return machine;
    }
}
