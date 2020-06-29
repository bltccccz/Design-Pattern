package proxy.pattern;

import proxy.obj.ITerminatorControlCenter;
import proxy.obj.TerminatorControlCenter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description JDK动态代理接口
 */
public class JDKProxy implements InvocationHandler {

    /**
     * 被代理的对象实例
     */
    Object object;

    public JDKProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.object, args);
    }

    public static void main(String[] args) {
        TerminatorControlCenter terminatorControlCenter = new TerminatorControlCenter();
        terminatorControlCenter.setOrder("Order");

        JDKProxy proxy = new JDKProxy(terminatorControlCenter);

        ClassLoader cl = proxy.getClass().getClassLoader();

        ITerminatorControlCenter itProxy = (ITerminatorControlCenter) Proxy.newProxyInstance(cl,
                new Class[]{ITerminatorControlCenter.class}, proxy);

        itProxy.login("Uc", "Cc");
        itProxy.executeOrder();
    }
}
