package composite;

import composite.obj.Branch;
import composite.obj.Root;
import composite.obj.Second;
import composite.obj.Third;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class CompositeTest {
    public static void main(String[] args) {
        Third third1 = new Third(null, "301");
        Third third2 = new Third(null, "302");
        Third third3 = new Third(null, "303");
        Third third4 = new Third(null, "304");
        Third third5 = new Third(null, "305");

        List<Branch> list = Arrays.asList(third1, third2, third3, third4, third5);

        Second second = new Second(list, "201");
        Second second1 = new Second(list, "202");

        List<Branch> list1 = Arrays.asList(second, second1);

        new Root(list1).show();
    }
}
