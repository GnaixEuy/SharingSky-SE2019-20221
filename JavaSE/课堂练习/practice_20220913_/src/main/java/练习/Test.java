package 练习;

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
        GuluGulu1 guluGulu1 = new GuluGulu1();
        GuluGulu2 guluGulu2 = new GuluGulu2();
        Thread thread = new Thread(guluGulu1);
        Thread thread2 = new Thread(guluGulu2);
        thread.start();
        thread2.start();
    }

}
