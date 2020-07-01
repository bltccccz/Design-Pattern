package adapter.obj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description 从A系统接数据
 */
public class ASystemImpl implements ASystemInterface {

    @Override
    public List<Map<String, String>> getAllUser() {
        return DbFile.USERS.stream()
                .map(m -> {
                    String name1 = m.get("name");
                    String phone = m.get("phone");
                    Map<String, String> map = new HashMap<>();
                    map.put("username", name1);
                    map.put("telephone", phone);
                    return map;
                })
                .collect(Collectors.toList());
    }
}
