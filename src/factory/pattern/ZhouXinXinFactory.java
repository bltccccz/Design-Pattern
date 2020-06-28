package factory.pattern;

import factory.obj.Machine;
import factory.obj.Terminator;
import factory.obj.ZhouXinXin;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public class ZhouXinXinFactory extends AbstractMachineFactory {

    @Override
    public <T extends Terminator> T createMachine(Class<T> c) {
        System.out.println("该工厂不生产 终结者 ,什么都不能给你");
        return null;
    }

    @Override
    public Machine createMachineZxx() {
        return ZhouXinxinObj.INSTANCE.zhouXinXin;
    }

    @Override
    public Machine createMachineT800() {
        System.out.println("该工厂不生产 终结者 ,什么都不能给你");
        return null;
    }

    @Override
    public  Machine createMachineT1000() {
        System.out.println("该工厂不生产 终结者 ,什么都不能给你");
        return null;
    }

    enum ZhouXinxinObj {
        INSTANCE;
        private ZhouXinXin zhouXinXin;

        ZhouXinxinObj() {
            this.zhouXinXin = new ZhouXinXin();
        }
    }
}
