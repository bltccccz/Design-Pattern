package chainofresponsibility;

import chainofresponsibility.obj.Bank;
import chainofresponsibility.obj.HandlerMember;
import chainofresponsibility.obj.People;
import chainofresponsibility.obj.School;
import chainofresponsibility.pattern.Handler;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description <p>
 * 请求和处理的分离，请求者可以不知道是谁处理，处理中也不用知道请求者全貌
 * </p>
 */
public class ChainOfResponsibilityTest {

    private final static School SCHOOL = new School();
    private final static Bank BANK = new Bank();

    public static void main(String[] args) {
        //不使用责任链模式
        IntStream.rangeClosed(1, 3).forEach(i -> {
            handler(new People(i));
        });

        //责任链模式
        IntStream.rangeClosed(1, 3).forEach(i -> {
            LinkedList<HandlerMember> handlerMembers = new LinkedList<>();
            handlerMembers.addLast(SCHOOL);
            handlerMembers.addLast(BANK);

            Handler handler = new Handler(handlerMembers);
            handler.handler(new People(i));
        });
    }

    private static void handler(People people) {
        if (people.getType() == 1) {
            SCHOOL.answer(people);
        } else if (people.getType() == 2) {
            BANK.answer(people);
        } else {
            System.out.println("没人处理你的业务");
        }
    }
}
