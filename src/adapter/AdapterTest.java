package adapter;

import adapter.obj.ASystemImpl;
import adapter.obj.BSystemImpl;
import adapter.obj.User;

import java.util.List;
import java.util.Map;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class AdapterTest {

    public static void main(String[] args) {
        //A系统获取的数据
        List<Map<String, String>> allUser = new ASystemImpl().getAllUser();

        System.out.println(allUser);

        List<User> list = new BSystemImpl().getUserInfo();
        list.stream().forEach(System.out::println);
    }
}
