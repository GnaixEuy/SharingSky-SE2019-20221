package exception;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/2
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class FirstCase {

    public static void main(String[] args) {
        try {
            System.out.println("第一种情况");
        } catch (Exception e) {
            System.out.println("捕获异常");
            throw new RuntimeException(e);
        }
        System.out.println("未发生异常");
    }

}
