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
public class ThirdCase {

    @SuppressWarnings(value = "ALL")
    public static void main(String[] args) {
        try {
            System.out.println("第三种情况");
            int error = 1 / 0;
        } catch (Exception e) {
            System.out.println("发生异常已捕获，除0异常");
            throw new RuntimeException();
        }
        System.out.println("继续执行");
    }

}
