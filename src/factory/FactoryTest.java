package factory;

import factory.obj.Machine;
import factory.obj.Terminator1000;
import factory.obj.Terminator800;
import factory.obj.ZhouXinXin;
import factory.pattern.SimpleMachineFactory;
import factory.pattern.TerminatorFactory;
import factory.pattern.ZhouXinXinFactory;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public class FactoryTest {

    /**
     * <p>
     * SimpleMachineFactory中只要明确需要生成的对象，即可生成;
     * 而继承AbstractMachineFactory的工厂可以提供特定定制服务，比如 机器人 的产品中存在一个Terminator系列，T800继承
     * Terminator,该系列中还有T2000,T3000等等，并且同一型号可以生产多台;
     * 而周星星系列只有一个，所以采用单例;
     * <p>
     * 此处的工厂中没有详细分开是因为仅仅是作为演示
     * </p>
     *
     * @param args
     */

    public static void main(String[] args) {

        System.out.println("By SimpleMachineFactory Create :");

        Terminator800 terminator800 = SimpleMachineFactory.createMachine(Terminator800.class);

        terminator800.getOutLook();
        terminator800.executeOrder();

        Terminator1000 terminator1000 = SimpleMachineFactory.createMachine(Terminator1000.class);
        terminator1000.getOutLook();
        terminator1000.executeOrder();

        ZhouXinXin zhouXinXin = SimpleMachineFactory.createMachine(ZhouXinXin.class);

        zhouXinXin.getOutLook();
        zhouXinXin.executeOrder();

        System.out.println("=================");


        System.out.println("By AbstractFactory Create :");
        TerminatorFactory terminatorFactory = new TerminatorFactory();
        Machine machineT800 = terminatorFactory.createMachineT800();
        machineT800.getOutLook();
        machineT800.executeOrder();

        Machine machineT1000 = terminatorFactory.createMachineT1000();
        machineT1000.getOutLook();
        machineT1000.executeOrder();

        terminatorFactory.createMachineZxx();

        Terminator1000 T1000 = terminatorFactory.createMachine(Terminator1000.class);
        T1000.getOutLook();
        T1000.executeOrder();

        Terminator800 T800 = terminatorFactory.createMachine(Terminator800.class);
        T800.getOutLook();
        T800.executeOrder();

        ZhouXinXinFactory zhouXinXinFactory = new ZhouXinXinFactory();
        Machine machineZxx = zhouXinXinFactory.createMachineZxx();
        machineZxx.getOutLook();
        machineZxx.executeOrder();

        zhouXinXinFactory.createMachine(Terminator800.class);
        zhouXinXinFactory.createMachine(Terminator1000.class);
        zhouXinXinFactory.createMachineT800();
        zhouXinXinFactory.createMachineT1000();
    }
}
