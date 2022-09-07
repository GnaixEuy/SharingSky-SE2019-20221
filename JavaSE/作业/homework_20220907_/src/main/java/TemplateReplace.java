import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class TemplateReplace {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/作业/homework_20220907_/src/main/resources/person.template"));
            bufferedWriter = new BufferedWriter(new FileWriter("/Users/gnaixeuy/Desktop/SharingSky-SE2019-20221/JavaSE/作业/homework_20220907_/src/main/resources/person.txt", StandardCharsets.UTF_8));
            String str = bufferedReader.readLine();
            while (str != null) {
                if (str.contains("{name}")) {
                    str = str.replaceAll("\\{name}", "超级变换形态卡布达");
                }
                if (str.contains("{grade}")) {
                    str = str.replaceAll("\\{grade}", "Java和尚班");
                }
                if (str.contains("{speciality}")) {
                    str = str.replaceAll("\\{speciality}", "软件工程");
                }
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                str = bufferedReader.readLine();
            }
            bufferedWriter.flush();
            System.out.println("替换成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
