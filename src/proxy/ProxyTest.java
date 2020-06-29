package proxy;

import proxy.obj.MovieStart;
import proxy.obj.MovieStartProxy;
import proxy.obj.TerminatorControlCenter;
import proxy.pattern.NormalTerminatorProxy;
import proxy.pattern.TerminatorProxy;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class ProxyTest {
    public static void main(String[] args) {
        //不使用代理
        TerminatorControlCenter terminatorControlCenter = new TerminatorControlCenter();
        terminatorControlCenter.login("Cc", "Uc");
        terminatorControlCenter.setOrder("Protect Conna");
        terminatorControlCenter.executeOrder();

        //代理登录
        TerminatorProxy terminatorProxy = new TerminatorProxy(new TerminatorControlCenter());
        terminatorProxy.login("Cc", "Uc");
        terminatorProxy.executeOrder();

        //普通代理
        NormalTerminatorProxy normalTerminatorProxy = new NormalTerminatorProxy();
        normalTerminatorProxy.login("Cc", "Uc");
        normalTerminatorProxy.executeOrder();

        //强制代理
        MovieStart movieStart = new MovieStart("小鲜肉");
        MovieStartProxy proxy = new MovieStartProxy(movieStart);
        movieStart.setProxy01(proxy);

        movieStart.respond();
        proxy.call();

        MovieStartProxy proxy1 = movieStart.getProxy();
        movieStart.setProxy01(proxy1);
        proxy1.call();

    }
}
