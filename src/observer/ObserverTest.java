package observer;

import observer.obj.NormalCamera;
import observer.obj.PeopleInStreet;
import observer.obj.PinholeCamera;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class ObserverTest {
    public static void main(String[] args) {
        PeopleInStreet peopleInStreet = new PeopleInStreet(new NormalCamera(), new PinholeCamera());
        peopleInStreet.eat();
        peopleInStreet.other();
    }
}
