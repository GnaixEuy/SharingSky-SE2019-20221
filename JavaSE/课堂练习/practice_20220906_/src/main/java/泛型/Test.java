package 泛型;

import java.util.Random;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/6
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        Realize<Random> randomRealize = new Realize<>(random);
        System.out.println(randomRealize.get().getClass());
    }

}
