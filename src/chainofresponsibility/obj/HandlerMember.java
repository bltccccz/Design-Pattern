package chainofresponsibility.obj;

/**
 * @author zhicheng.zhang
 * @date 2020/6/30
 * @description
 */
public abstract class HandlerMember {

    private int type;

    private HandlerMember next;

    public HandlerMember(int type) {
        this.type = type;
    }

    public void setNext(HandlerMember next) {
        this.next = next;
    }

    public void handlerMsg(People people) {
        if (this.type == people.getType()) {
            answer(people);
            return;
        }
        if (next != null) {
            next.handlerMsg(people);
        } else {
            System.out.println("没人处理业务");
        }

    }

    protected abstract void answer(People people);
}
