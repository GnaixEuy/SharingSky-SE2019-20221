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
public class ModifyPerson implements Runnable {

    private Person person;
    private int n;


    public ModifyPerson(Person person) {
        super();
        this.person = person;
    }


    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            synchronized (person) {
                if (!person.isShowFlag()) {
                    n++;
                    if (n % 2 == 0) {
                        person.setPerson("tom", "男");
                    } else {
                        person.setPerson("Mary", "女");
                    }
                    person.setShowFlag(true);
                    person.notify();
                } else {
                    try {
                        person.wait();
                    } catch (Exception e) {
                        // TODO: handle exceptione
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
