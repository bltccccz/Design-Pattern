package decorator;

import decorator.obj.Mother;
import decorator.obj.Vegetables;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description <p>
 * 譬如买菜，单价，是否新鲜都是不固定的，于是在把买来的菜交给妈妈之前，先把市场里的信息告诉她，从而得到想要的结果
 * 修饰的手法不一，可以分情况逐一修饰
 * </p>
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Vegetables vegetables = new Vegetables(false, 11, 4);
        Vegetables forSale = new Vegetables(false, 11, 4);
        Mother mother = new Mother(vegetables);
        mother.motherSay();

        mother.setForSale(forSale);
        mother.motherSay();
    }
}
