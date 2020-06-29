package proxy.pattern;

import proxy.obj.ITerminatorControlCenter;
import proxy.obj.TerminatorControlCenter;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class TerminatorProxy implements ITerminatorControlCenter {
    private TerminatorControlCenter terminatorControlCenter;

    public TerminatorProxy(TerminatorControlCenter terminatorControlCenter) {
        this.terminatorControlCenter = terminatorControlCenter;
        this.terminatorControlCenter.setOrder("Improve itself");
    }

    @Override
    public void login(String un, String pd) {
        terminatorControlCenter.login(un, pd);
    }

    @Override
    public void executeOrder() {
        terminatorControlCenter.executeOrder();
    }
}
