import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class TestPhotoCopy {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/课堂练习/practice_20220907_/src/main/resources/keqing.jpg");
            fileOutputStream = new FileOutputStream("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/课堂练习/practice_20220907_/src/main/resources/flj.jpg");
            int tmp;
            while ((tmp = fileInputStream.read()) != -1) {
                fileOutputStream.write(tmp);
            }
            System.out.println("拷贝成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
