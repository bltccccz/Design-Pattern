package builder.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class T800Builder implements TerminatorBuilder {

    private Terminator terminator = new Terminator();

    @Override
    public T800Builder setOrder(String order) {
        terminator.setOrder(order);
        return this;
    }

    @Override
    public T800Builder setType(String type) {
        terminator.setType(type);
        return this;
    }

    @Override
    public Terminator getModel() {
        return this.terminator;
    }
}
