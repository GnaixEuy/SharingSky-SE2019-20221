package 反射;

import java.lang.reflect.Constructor;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Test {

    public static void main(String[] args) {
        try {
            Constructor<Computer> computerConstructor = Computer.class.getConstructor(
                    String.class,
                    String.class,
                    String.class,
                    String.class,
                    String.class,
                    String.class
            );
            Computer computer = computerConstructor.newInstance(
                    "11400f",
                    "幻光戟",
                    "西数",
                    "3090",
                    "1000W",
                    "三星显示器"
            );
            System.out.println(computer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
