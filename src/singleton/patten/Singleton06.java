package singleton.patten;

import singleton.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description 利用枚举构造函数有且只加载一次的特性完成单例，无锁
 * <p>
 * <p>
 * 推荐使用
 */
public final class Singleton06 {

    private Singleton06() {

    }

    enum EnumInstance {
        INSTANCE;

        private Machine machine;

        EnumInstance() {
            machine = new Machine();
        }
    }


    public static Machine instance() {
        return EnumInstance.INSTANCE.machine;
    }
}
