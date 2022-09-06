package 泛型;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/6
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Realize<T> implements General<T> {

    private final T t;

    public Realize(T t) {
        this.t = t;
        System.out.println("普通实现类");
    }

    @Override
    public T get() {
        return this.t;
    }

}
