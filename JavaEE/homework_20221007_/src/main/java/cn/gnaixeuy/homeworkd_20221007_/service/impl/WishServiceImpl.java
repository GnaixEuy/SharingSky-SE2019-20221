package cn.gnaixeuy.homeworkd_20221007_.service.impl;

import cn.gnaixeuy.homeworkd_20221007_.dao.WishDao;
import cn.gnaixeuy.homeworkd_20221007_.dao.impl.WishDaoImpl;
import cn.gnaixeuy.homeworkd_20221007_.entity.Wish;
import cn.gnaixeuy.homeworkd_20221007_.service.WishService;

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
public class WishServiceImpl implements WishService {

    private final WishDao wishDao = new WishDaoImpl();

    @Override
    public boolean addWish(Wish wish) {
        return this.wishDao.insert(wish) == 1;
    }

    @Override
    public boolean deleteWish(Integer id) {
        return this.wishDao.delete(id) == 1;
    }

    @Override
    public List<Wish> getAll() {
        return this.wishDao.selectList();
    }
}
