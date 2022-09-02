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
        Printer printer = new Printer();
        InkBox inkBox1 = new BlackInkBox();
        InkBox inkBox2 = new ColorsInkBox();
        Paper papar1 = new A4();
        Paper papar2 = new B5();
        printer.setInkBox(inkBox1);
        printer.setPaper(papar1);
        printer.print();

    }
}
