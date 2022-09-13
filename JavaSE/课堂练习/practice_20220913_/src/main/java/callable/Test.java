package callable;

import java.util.concurrent.ExecutionException;
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

        try {
            ThreadCallable threadCallable = new ThreadCallable();
            FutureTask<String> stringFutureTask = new FutureTask<>(threadCallable);
            Thread thread = new Thread(stringFutureTask);
            thread.start();
            System.out.println(stringFutureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}
