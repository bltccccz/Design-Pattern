package observer.obj;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public abstract class Camera {

    private final String cameraName;

    public Camera(String cameraName) {
        this.cameraName = cameraName;
    }

    protected String getCameraName() {
        return cameraName;
    }

    public abstract void showInScreen(String msg);
}
