import java.util.concurrent.FutureTask;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/13
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Test {

    public static void main(String[] args) {
        Object1 object1 = new Object1();
        Thread object2 = new Thread(new Object2());
        FutureTask<String> stringFutureTask = new FutureTask<>(new Object3());
        Thread object3 = new Thread(stringFutureTask);
        object1.start();
        object2.start();
        object3.start();
    }

}
