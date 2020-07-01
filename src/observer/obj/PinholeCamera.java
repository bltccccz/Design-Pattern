package observer.obj;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class PinholeCamera extends Camera {
    public PinholeCamera() {
        super("针孔摄像头");
    }

    @Override
    public void showInScreen(String msg) {
        System.out.println(super.getCameraName() + "拍摄到: " + msg + " ，好下流");
    }
}
