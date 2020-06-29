package proxy.obj;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class MovieStart {
    private String name;

    private MovieStartProxy proxy;

    private MovieStartProxy proxy01;

    /**
     * 我的代理是哪个
     *
     * @param name
     */
    public MovieStart(String name) {
        this.name = name;
        this.proxy = new MovieStartProxy(this);
    }


    public MovieStartProxy getProxy() {
        return this.proxy;
    }

    public void setProxy01(MovieStartProxy proxy01) {
        this.proxy01 = proxy01;
    }

    private boolean isThisProxy() {
        return this.proxy.equals(proxy01);
    }

    public void respond() {
        if (!isThisProxy()) {
            System.out.println("去找我代理，谢谢");
        } else {
            System.out.println("知道了");
        }
    }
}
