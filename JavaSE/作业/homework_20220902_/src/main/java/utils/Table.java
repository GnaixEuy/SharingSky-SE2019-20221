package utils;


/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/2
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Table {
    public static final StringBuffer contentSb = new StringBuffer();
    /**
     * 调整每列的宽度
     */
    public static Integer[] widths = new Integer[]{15, 20, 2, 15, 20};

    public static void print_table(String sid, String name) {
        String[] table = {sid, name};
        for (int i = 0; i < 2; ++i) {
            int size = widths[i];
            contentSb.append("|");
            int len = table[i].length();
            int leftSpace = (size - len) % 2 == 0 ? (size - len) / 2 : (size - len) / 2 + 1;
            int rightSpace = (size - len) / 2;
            //左边空格
            contentSb.append(" ".repeat(Math.max(0, leftSpace)));
            contentSb.append(table[i]);
            contentSb.append(" ".repeat(Math.max(0, rightSpace)));
        }
        contentSb.append("\n");
        for (int i = 0; i < 2; ++i) {
            contentSb.append("+");
            contentSb.append("-".repeat(Math.max(0, widths[i])));
        }
        contentSb.append("+\n");
    }

    public static void print_table(String sid, String name, Integer age, String gender, String organization) {
        String[] table = {sid, name, String.valueOf(age), gender, organization};
        for (int i = 0; i < 5; ++i) {
            int size = widths[i];
            contentSb.append("|");
            int len = table[i].length();
            int leftSpace = (size - len) % 2 == 0 ? (size - len) / 2 : (size - len) / 2 + 1;
            int rightSpace = (size - len) / 2;
            //左边空格
            contentSb.append(" ".repeat(Math.max(0, leftSpace)));
            contentSb.append(table[i]);
            contentSb.append(" ".repeat(Math.max(0, rightSpace)));
        }
        contentSb.append("\n");
        for (int i = 0; i < 5; ++i) {
            contentSb.append("+");
            contentSb.append("-".repeat(Math.max(0, widths[i])));
        }
        contentSb.append("+\n");
    }

    public static void clearAll() {
        contentSb.delete(0, contentSb.length());
    }
}