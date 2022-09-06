package IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

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

        byte[] words = new byte[1024];
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        int len = -1;
        try {
            fileInputStream = new FileInputStream("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/课堂练习/practice_20220906_/src/main/resources/myInfo.txt");
            fileOutputStream = new FileOutputStream("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/课堂练习/practice_20220906_/src/main/resources/myFile/endInfo.txt");
            while ((len = fileInputStream.read(words)) != -1) {
                fileOutputStream.write(words, 0, len);
            }
            System.out.println(new String(words, StandardCharsets.UTF_8));
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
