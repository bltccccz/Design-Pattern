package adapter.obj;

import java.util.*;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class DbFile {
    public final static List<Map<String, String>> USERS = new ArrayList<>();

    static {
        Map<String, String> zs = new HashMap<>();
        zs.put("name", "zs");
        zs.put("phone", "12341111");

        Map<String, String> ls = new HashMap<>();
        ls.put("name", "ls");
        ls.put("phone", "12341211");

        Map<String, String> ww = new HashMap<>();
        ww.put("name", "ww");
        ww.put("phone", "12341311");

        USERS.add(zs);
        USERS.add(ls);
        USERS.add(ww);
    }
}
