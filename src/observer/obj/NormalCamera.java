package observer.obj;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class NormalCamera extends Camera {
    public NormalCamera() {
        super("防贼摄像头");
    }

    @Override
    public void showInScreen(String msg) {
        System.out.println(getCameraName() + "拍摄到: " + msg);
    }
}
