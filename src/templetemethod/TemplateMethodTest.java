package templetemethod;

import templetemethod.pattern.T1000;
import templetemethod.pattern.Tx;
import templetemethod.pattern01.T850;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        /**
         * 此种方式可参考Thread与Runnable
         */
        T850 terminator = new T850(() -> {
            System.out.println("去搬砖");
        });
        terminator.executeOrder();

        T850 terminator1 = new T850(null);
        terminator1.executeOrder();

        T1000 t1000 = new T1000();
        t1000.run();

        Tx tx = new Tx();
        tx.run();
    }
}
