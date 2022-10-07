package cn.gnaixeuy.homeworkd_20221007_.service;

import cn.gnaixeuy.homeworkd_20221007_.entity.Wish;

import java.util.List;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/09/倒闭.png"/>
 *
 *
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @version 1.0.0
 * @date 2022/10/7
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public interface WishService {

    boolean addWish(Wish wish);

    boolean deleteWish(Integer id);

    List<Wish> getAll();


}
