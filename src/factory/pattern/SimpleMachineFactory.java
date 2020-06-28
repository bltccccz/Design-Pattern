package factory.pattern;

import factory.obj.Machine;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public final class SimpleMachineFactory {
    private SimpleMachineFactory() {
        
    }

    /**
     * 使用泛型：传入参数必须为class,必须继续继承Machine
     *
     * @param c
     * @param <T>
     * @return
     */
    public static <T extends Machine> T createMachine(Class<T> c) {
        Machine machine = null;

        try {
            machine = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生成机器人过程产生错误");
        }

        return (T) machine;
    }
}
