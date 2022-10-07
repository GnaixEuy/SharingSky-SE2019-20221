package cn.gnaixeuy.homeworkd_20221007_.controller; /**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/09/倒闭.png"/>
 *
 *
 *
 * <p>项目： SharingSky-SE2019-20221 </p>
 *
 * @author GnaixEuy
 * @date 2022/10/7
 * @version 1.0.0
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */

import cn.gnaixeuy.homeworkd_20221007_.entity.Wish;
import cn.gnaixeuy.homeworkd_20221007_.service.WishService;
import cn.gnaixeuy.homeworkd_20221007_.service.impl.WishServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "WishListServlet", value = "/WishListServlet")
public class WishListServlet extends HttpServlet {

    private final WishService wishService = new WishServiceImpl();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Wish> all = this.wishService.getAll();
        ServletContext application = request.getServletContext();
        application.setAttribute("WishList", all);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
