package singleton.patten;

import singleton.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description 实现懒加载生成单一对象，利用final static特性保证多线程下单一对象，无锁一定程度上提升效率
 * <p>
 * <p>
 * 推荐使用
 */
public final class Singleton05 {

    private Singleton05() {

    }

    static class MachineHolder {
        public final static Machine machine = new Machine();
    }

    public static Machine instance() {
        return MachineHolder.machine;
    }
}
