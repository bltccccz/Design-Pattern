package builder.pattern;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public interface TerminatorBuilder {
    TerminatorBuilder setOrder(String order);

    TerminatorBuilder setType(String type);

    Terminator getModel();
}
