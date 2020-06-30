package mediator.pattern;

import mediator.obj.Seller;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Mediator {
    private ArrayList<Seller> houseInfo = new ArrayList<>();

    public void submitInfo(Seller seller) {
        houseInfo.add(seller);
    }

    public void showAll() {
        IntStream.range(0, houseInfo.size()).forEach(i -> {
            houseInfo.get(i).detail();
        });
    }
}
