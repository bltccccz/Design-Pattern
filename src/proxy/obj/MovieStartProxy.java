package proxy.obj;

/**
 * @author Ccccz
 * @date 2020/6/29
 * @description
 */
public class MovieStartProxy {

    private MovieStart movieStart;

    /**
     * 我代理哪个明星
     *
     * @param movieStart
     */
    public MovieStartProxy(MovieStart movieStart) {
        this.movieStart = movieStart;
    }

    public void call() {
        movieStart.respond();
    }
}
