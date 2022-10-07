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

import cn.gnaixeuy.homeworkd_20221007_.service.WishService;
import cn.gnaixeuy.homeworkd_20221007_.service.impl.WishServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteWishServlet", value = "/DeleteWishServlet")
public class DeleteWishServlet extends HttpServlet {

    private final WishService wishService = new WishServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        System.out.println("delete" + id);
        if (this.wishService.deleteWish(id)) {
            request.getRequestDispatcher("/WishListServlet").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return;
    }
}
