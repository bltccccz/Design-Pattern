package protype.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class Terminator implements Cloneable {

    private String name;

    private String order;

    public Terminator(String name, String order) {
        this.name = name;
        this.order = order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void executeOrder() {
        System.out.println(this.name + " 执行 " + order + " 命令");
    }

    @Override
    public Terminator clone() {
        Terminator terminator = null;
        try {
            terminator = (Terminator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return terminator;
    }
}
