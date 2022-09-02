package throw_exception;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/2
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小白");
        try {
            person.setAge(101);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
