package adapter.obj;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description <p>
 * RMI使用远程对象，完成适配器
 * </p>
 */
public class BSystemImpl extends ASystemImpl implements BSystemInterface {

    final List<Map<String, String>> list = super.getAllUser();

    @Override
    public List<User> getUserInfo() {
        return list.stream().map(m -> {
            return new User(m.get("username"), m.get("telephone"));
        }).collect(Collectors.toList());

    }
}
