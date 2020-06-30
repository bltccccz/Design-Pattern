package command;

import command.obj.AirMissile;
import command.obj.Artillery;
import command.obj.GroundForce;
import command.pattern.Order;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class CommandTest {
    public static void main(String[] args) {
        //不使用命令模式
        /**
         * 战场情形瞬息万变
         * 现在地方空军入侵，随后地面部队进攻，我方只能先放空， 然后炮兵掩护打击，随后地面部队进攻
         */
        AirMissile missile = new AirMissile();
        Artillery artillery = new Artillery();
        GroundForce groundForce = new GroundForce();
        missile.attack();
        artillery.cover();
        artillery.attack();
        groundForce.attack();

        /**
         * 面对万变的情形，我方只能逐个通知，因此我方聘用一位将领，将领统一对部队发号施令
         *
         * 此处的演示为了方便使用enum单例模式让指挥官只有一个，策略模式对应不同的命令
         *
         * 面对多变的情形，无须具体通知到各个部队，只需要指挥官给出命令
         */
        Order.AIR_MISSILE_ATTACK.execute();
        Order.ARTILLERY_COVER.execute();
        Order.ARTILLERY_ATTACK.execute();
        Order.FORCE_ATTACK.execute();
    }
}
