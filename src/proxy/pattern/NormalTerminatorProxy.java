package proxy.pattern;

import proxy.obj.ITerminatorControlCenter;
import proxy.obj.TerminatorControlCenter;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description 不需要知道用户是谁，只需要知道代理
 */
public class NormalTerminatorProxy implements ITerminatorControlCenter {
    private final TerminatorControlCenter terminatorControlCenter;

    public NormalTerminatorProxy() {
        this.terminatorControlCenter = new TerminatorControlCenter();
        terminatorControlCenter.setOrder("普通代理   执行自我完善");
    }

    @Override
    public void login(String un, String pd) {
        this.terminatorControlCenter.login(un, pd);
    }

    @Override
    public void executeOrder() {
        this.terminatorControlCenter.executeOrder();
    }
}
