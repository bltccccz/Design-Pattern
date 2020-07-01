package composite.obj;

import java.util.List;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public class Root extends Branch {

    public Root(List<Branch> branches) {
        super(branches, "ROOT");
    }
}
