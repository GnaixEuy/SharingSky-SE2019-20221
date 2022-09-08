package 反射;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/9/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Computer {

    private String cpu;
    private String memory;
    private String disk;
    private String graphicsCard;
    private String power;
    private String monitor;

    protected Computer(String disk, String graphicsCard, String cpu) {
        this.disk = disk;
        this.graphicsCard = graphicsCard;
        this.cpu = cpu;
    }

}
