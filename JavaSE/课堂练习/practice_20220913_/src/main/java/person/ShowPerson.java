package person;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/13
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class ShowPerson implements Runnable {
    private final Person person;

    public ShowPerson(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                if (person.isShowFlag()) {
                    person.showPerson();
                    //输出之后将状态改回false
                    person.setShowFlag(false);
                    person.notify();//唤醒其他线程
                } else {
                    try {
                        //设置过值进入等待状态
                        person.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
