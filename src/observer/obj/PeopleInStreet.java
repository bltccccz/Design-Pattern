package observer.obj;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class PeopleInStreet {
    private final Camera normal;

    private final Camera pinhole;

    public PeopleInStreet(Camera normal, Camera pinhole) {
        System.out.println("大街上装了摄像头");
        this.normal = normal;
        this.pinhole = pinhole;
    }

    public void eat() {
        System.out.println("这个人手里捧着东西放嘴边!");
        normal.showInScreen("这人在吃东西");
    }

    public void other() {
        System.out.println("这个人站在黑暗无人的角落!");
        pinhole.showInScreen("哇！他在小便!");
    }
}
