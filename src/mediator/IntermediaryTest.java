package mediator;

import mediator.obj.HouseRenovation;
import mediator.obj.HouseSeller;
import mediator.obj.HouseType;
import mediator.pattern.Mediator;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description <p>
 * 卖房子和装修的咨询本来需要自己逐个询问，而现在卖家把消息托管到中介平台，买家也只需要通过中介平台即可获取需要的信息
 * </p>
 */
public class IntermediaryTest {
    public static void main(String[] args) {
        //直接调用
        HouseSeller seller = new HouseSeller(1000, HouseType.VILLA);
        seller.detail();

        HouseRenovation renovation = new HouseRenovation(HouseType.VILLA, 10);
        renovation.detail();

        //使用中介者
        Mediator mediator = new Mediator();
        mediator.submitInfo(seller);
        mediator.submitInfo(renovation);

        mediator.showAll();
    }
}
