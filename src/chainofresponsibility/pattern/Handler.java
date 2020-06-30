package chainofresponsibility.pattern;

import chainofresponsibility.obj.HandlerMember;
import chainofresponsibility.obj.People;

import java.util.LinkedList;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description <p>
 * 这里纯属实验一下LinkedList,
 * 可以直接在HandlerMember下set下一个检索者
 * </p>
 */
public class Handler {
    private final LinkedList<HandlerMember> MEMBERS;

    public void handler(People people) {
        HandlerMember handlerMember = MEMBERS.removeFirst();
        handlerMember.setNext(MEMBERS.peek());
        handlerMember.handlerMsg(people);
    }

    public Handler(LinkedList<HandlerMember> MEMBERS) {
        this.MEMBERS = MEMBERS;
    }
}
