package person;

import lombok.Data;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/13
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
@Data
public class Person {

    private String name;
    private String sex;

    private boolean showFlag = false;

    public void setPerson(String name, String sex) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.name = name;
        this.sex = sex;
    }

    public void showPerson() {
        System.out.println("姓名：" + this.name + " 性别：" + this.sex);
    }


}
