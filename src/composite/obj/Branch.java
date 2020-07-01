package composite.obj;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Ccccz
 * @date 2020/7/1
 * @description
 */
public abstract class Branch {
    private final List<Branch> branches;

    private final String name;

    public Branch(List<Branch> branches, String name) {
        this.branches = branches;
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected List<Branch> getBranches() {
        return branches;
    }

    public void show() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("当期节点名称: ")
                .append(name);
        if (branches == null) {
            stringBuilder.append(" 节点下再无其他节点");
        } else {
            stringBuilder.append(" 节点之下包含: ");
            IntStream.range(0, branches.size())
                    .forEach(i -> {
                        stringBuilder.append(branches.get(i).name + " ");
                        branches.get(i).show();
                    });
        }
        System.out.println(stringBuilder.toString());
    }
}
