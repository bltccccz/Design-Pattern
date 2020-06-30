package chainofresponsibility.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class School extends HandlerMember {
    public School() {
        super(1);
    }

    @Override
    public void answer(People people) {
        System.out.println(people.getType() + ":读书");
    }
}
