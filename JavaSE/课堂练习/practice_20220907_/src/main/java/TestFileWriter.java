import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class TestFileWriter {

    public static void main(String[] args) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/课堂练习/practice_20220907_/src/main/resources/myInfo.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("i am kabuda");
            bufferedWriter.newLine();
            bufferedWriter.write("小让\n");
            bufferedWriter.write("启动超级变换形态");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
