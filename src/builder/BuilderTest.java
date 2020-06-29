package builder;

import builder.pattern.T800Builder;
import builder.pattern.Terminator;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class BuilderTest {

    /**
     * 用户只需要给定条件而不需要知道对象创建细节
     *
     * @param args
     */
    public static void main(String[] args) {
        T800Builder t800Builder = new T800Builder();
        Terminator model = t800Builder.setType("T800").setOrder("搬砖").getModel();
        model.executeOrder();
    }
}
