package chainofresponsibility.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Bank extends HandlerMember {

    public Bank() {
        super(2);
    }

    @Override
    public void answer(People people) {
        System.out.println(people.getType() + ":取钱业务");
    }
}
