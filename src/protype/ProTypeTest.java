package protype;

import protype.pattern.Terminator;

import java.util.stream.IntStream;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description 原型模式
 */
public class ProTypeTest {
    public static void main(String[] args) {
        Terminator terminator = new Terminator("T1", "Do");
        terminator.executeOrder();

        IntStream.rangeClosed(2, 5).forEach(i -> {
            Terminator clone = terminator.clone();
            clone.setName("T" + i);
            clone.setOrder("DO");
            clone.executeOrder();
        });
    }
}
