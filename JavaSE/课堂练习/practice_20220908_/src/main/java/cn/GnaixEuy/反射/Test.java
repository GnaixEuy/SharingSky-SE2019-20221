package cn.GnaixEuy.反射;

import cn.GnaixEuy.反射.entity.Student;

import java.lang.reflect.Method;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/8
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Test {

    public static void main(String[] args) {

        Student student = new Student("名字", 13);
        try {
            Method getName = Student.class.getDeclaredMethod("getName");
            Method getAge = Student.class.getDeclaredMethod("getAge");
            System.out.println("getName.invoke(student) = " + getName.invoke(student));
            System.out.println("getAge.invoke(student) = " + getAge.invoke(student));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Method setName = Student.class.getDeclaredMethod("setName", String.class);
            Method setAge = Student.class.getDeclaredMethod("setAge", Integer.class);
            setName.invoke(student, "超级变换形态卡布达");
            setAge.invoke(student, 18);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Method toString = Student.class.getDeclaredMethod("toString");
            System.out.println("toString.invoke(student) = " + toString.invoke(student));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
