package singleton.patten;

import singleton.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description 利用static和final的特性保证单一对象
 */
public final class Singleton01 {

    private Singleton01() {

    }


    private final static Machine MACHINE = new Machine();

    public static Machine instance() {
        return MACHINE;
    }
}
