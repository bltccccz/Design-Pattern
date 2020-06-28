package factory.pattern;

import factory.obj.Machine;
import factory.obj.Terminator;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public class TerminatorFactory extends AbstractMachineFactory {


    @Override
    public <T extends Terminator> T createMachine(Class<T> c) {
        Terminator terminator = null;

        try {
            terminator = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) terminator;
    }

    @Override
    public Machine createMachineZxx() {
        System.out.println("该工厂不生产 周星星 只能默认给你个 T800");
        return createMachineT800();
    }
}
