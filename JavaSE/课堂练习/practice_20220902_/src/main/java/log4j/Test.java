package log4j;

import lombok.extern.log4j.Log4j;

import java.util.Scanner;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/2
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
@Log4j
public class Test {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数：");
            int numl = in.nextInt();
            System.out.print("请输入除数：");
            int num2 = in.nextInt();
            System.out.printf("%d / %d = %d%n", numl, num2, numl / num2);
        } catch (Exception e) {
            log.error("出现异常", e);
        } finally {
            System.out.println("感谢使用本程序！");
        }

    }
}
