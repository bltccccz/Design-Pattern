package factory.pattern;

import factory.obj.*;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public abstract class AbstractMachineFactory {
    public abstract <T extends Terminator> T createMachine(Class<T> c);

    public Machine createMachineT800() {
        return new Terminator800();
    }

    public Machine createMachineT1000() {
        return new Terminator1000();
    }

    public abstract Machine createMachineZxx();
}
