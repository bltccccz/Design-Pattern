package singleton;

import singleton.obj.Machine;
import singleton.patten.*;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public class SingletonTest {

    public static void main(String[] args) {
        Machine machineBasic = new Machine();
        Machine machineBasic1 = new Machine();

        System.out.println("单线程下两次new对象: " + machineBasic.equals(machineBasic1));

        Machine singleMachine = Singleton01.instance();
        Machine singleMachine1 = Singleton01.instance();

        System.out.println("单线程下第一种单例模式: " + singleMachine.equals(singleMachine1));

        Machine single2Machine = Singleton02.instance();
        Machine single2Machine2 = Singleton02.instance();

        System.out.println("单线程下第二种单例模式: " + single2Machine.equals(single2Machine2));

        Machine single3Machine = Singleton03.instance();
        Machine single3Machine2 = Singleton03.instance();

        System.out.println("单线程下第三种单例模式: " + single3Machine.equals(single3Machine2));

        Machine single4Machine = Singleton04.instance();
        Machine single4Machine2 = Singleton04.instance();

        System.out.println("单线程下第四种单例模式: " + single4Machine.equals(single4Machine2));

        Machine single5Machine = Singleton05.instance();
        Machine single5Machine2 = Singleton05.instance();

        System.out.println("单线程下第五种单例模式: " + single5Machine.equals(single5Machine2));

        Machine single6Machine = Singleton06.instance();
        Machine single6Machine2 = Singleton06.instance();

        System.out.println("单线程下第六种单例模式: " + single6Machine.equals(single6Machine2));
    }
}
