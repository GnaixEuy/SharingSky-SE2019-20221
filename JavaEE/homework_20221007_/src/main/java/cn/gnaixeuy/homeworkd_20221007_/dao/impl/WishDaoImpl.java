package cn.gnaixeuy.homeworkd_20221007_.dao.impl;

import cn.gnaixeuy.homeworkd_20221007_.dao.WishDao;
import cn.gnaixeuy.homeworkd_20221007_.entity.Wish;
import cn.gnaixeuy.homeworkd_20221007_.utils.DBUtil;

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
public class WishDaoImpl implements WishDao {

    @Override
    public int insert(Wish wish) {
        String sql = "INSERT INTO homework.`mess` (name,message,createtime) VALUE(?,?,?);";
        return DBUtil.myExecuteUpdate(
                sql,
                wish.getName(),
                wish.getMessage(),
                wish.getCreatetime()
        );
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM homework.`mess` WHERE id = ?;";
        return DBUtil.myExecuteUpdate(sql, id);
    }

    @Override
    public List<Wish> selectList() {
        String sql = "SELECT * FROM homework.`mess`;";
        return (List<Wish>) DBUtil.select(sql, Wish.class);
    }

}
