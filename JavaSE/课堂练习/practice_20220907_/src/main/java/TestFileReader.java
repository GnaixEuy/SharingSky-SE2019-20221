import java.io.BufferedReader;
import java.io.FileReader;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class TestFileReader {

    public static void main(String[] args) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/课堂练习/practice_20220907_/src/main/resources/myInfo.txt");
            bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while (str != null) {
                System.out.println(str);
                str = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
