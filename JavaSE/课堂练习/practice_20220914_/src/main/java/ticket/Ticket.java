package ticket;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/14
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class Ticket extends Thread {

    public static int ticketNum = 200;

    public synchronized static boolean saleTicket() {
        if (Ticket.ticketNum > 0) {
            Ticket.ticketNum--;
            System.out.println("售票成功！当前剩余票数：" + ticketNum);
            return true;
        } else {
            System.out.println("当前票已售完");
            return false;
        }
    }

    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        while (true) {
            if (!Ticket.saleTicket()) {
                break;
            }
        }
    }

}
