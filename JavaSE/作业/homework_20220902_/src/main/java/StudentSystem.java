import entity.Student;
import enumerate.Gender;
import lombok.extern.log4j.Log4j;
import utils.Table;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/2
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
@Log4j
public class StudentSystem {

    private static final ArrayList<Student> studentArrayList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init();

        try {
            while (true) {
                StudentSystem.clearConsole();
                switch (showOption()) {
                    case 1:
                        showAllStudent();
                        System.out.println("输入任意键回到目录");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case 2:
                        addStudentInfo();
                        break;
                    case 3:
                        deleteStudentByStuId();
                        break;
                    case 4:
                        showStudentInfoByStudentName();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("输入未知指令");
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
    }

    private static Integer showOption() {

        Table.clearAll();
        //第一行输出
        for (int i = 0; i < 2; ++i) {
            Table.contentSb.append("+");
            for (int j = 0; j < Table.widths[i]; ++j) {
                Table.contentSb.append("-");
            }
        }
        Table.contentSb.append("+\n");
        Table.print_table(" ", "操作");
        Table.print_table("1", "显示所有同学");
        Table.print_table("2", "增加同学");
        Table.print_table("3", "删除同学");
        Table.print_table("4", "查找指定同学");
        System.out.println(Table.contentSb);
        System.out.print("请输入你的选项:");
        return StudentSystem.scanner.nextInt();
    }


    private static void init() {
        String[] name = {"小白", "小花", "小华", "小李", "小苏"};
        long studentId = 201941054000L;
        for (int i = 1; i < 6; i++) {
            studentArrayList.add(new Student(studentId + i, name[name.length % i] + i, i, i % 3 == 0 ? Gender.FEMALE : i % 2 == 0 ? Gender.MALE : Gender.UNKNOWN, "软件" + i + "班"));
        }
    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handle any exceptions.
            log.error(e);
        }
    }

    public static void showAllStudent() {
        Table.clearAll();
        String[] titles = {"学号", "姓名", "年龄", "性别", "班级"};
        //第一行输出
        for (int i = 0; i < 5; ++i) {
            Table.contentSb.append("+");
            for (int j = 0; j < Table.widths[i]; ++j) {
                if (j == Table.widths[i] / 2 - 1) {
                    Table.contentSb.append(titles[i]);
                    j += 3;
                }
                Table.contentSb.append("-");
            }
        }
        Table.contentSb.append("+\n");
        StudentSystem.studentArrayList.forEach(item -> Table.print_table(item.getStudentId().toString(), item.getName(), item.getAge(), item.getGender().getSex(), item.getOrganization()));
        System.out.println(Table.contentSb);
        System.out.println("学生总数:" + StudentSystem.studentArrayList.size());
    }

    private static void addStudentInfo() {
        boolean isContinue;
        do {
            System.out.print("请输入学号:");
            long studentId = scanner.nextLong();
            scanner.nextLine();
            System.out.print("请输入姓名:");
            String name = scanner.nextLine();
            System.out.print("请输入年龄:");
            int age = scanner.nextInt();
            System.out.print("请输入班级:");
            String organization = scanner.next();
            System.out.print("请输入性别:");
            String next = scanner.next();
            Student student = new Student(
                    studentId,
                    name,
                    age,
                    "男".equals(next) ? Gender.MALE : "女".equals(next) ? Gender.FEMALE : Gender.UNKNOWN,
                    organization);
            StudentSystem.studentArrayList.add(student);
            System.out.println("添加成功");
            System.out.print("是否继续添加 y/N :");
            String isNext = scanner.nextLine();
            isContinue = "y".equals(isNext) || "Y".equals(isNext);
        } while (isContinue);
    }

    private static void deleteStudentByStuId() {
        showAllStudent();
        System.out.print("请输入你要删除的:");
        long deleteId = scanner.nextLong();
        Iterator<Student> iterator = StudentSystem.studentArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getStudentId() == deleteId) {
                iterator.remove();
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("删除失败,学号不存在");
    }

    private static void showStudentInfoByStudentName() {
        AtomicBoolean isThereAnyStudentInformation = new AtomicBoolean(false);
        Table.clearAll();
        String[] titles = {"学号", "姓名", "年龄", "性别", "班级"};
        //第一行输出
        for (int i = 0; i < 5; ++i) {
            Table.contentSb.append("+");
            for (int j = 0; j < Table.widths[i]; ++j) {
                if (j == Table.widths[i] / 2 - 1) {
                    Table.contentSb.append(titles[i]);
                    j += 3;
                }
                Table.contentSb.append("-");
            }
        }
        Table.contentSb.append("+\n");
        System.out.print("请输入学生姓名:");
        String name = scanner.nextLine();
        StudentSystem.studentArrayList.forEach(item -> {
            if (name.equals(item.getName())) {
                Table.print_table(item.getStudentId().toString(), item.getName(), item.getAge(), item.getGender().getSex(), item.getOrganization());
                isThereAnyStudentInformation.set(true);
            }
        });
        if (isThereAnyStudentInformation.get()) {
            System.out.println(Table.contentSb);
        } else {
            Table.clearAll();
        }
    }
}
