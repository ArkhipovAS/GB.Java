package gb.lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<head><title>Корзина</title></head>");
        resp.getWriter().print("<h1>CartServlet page servlet</h1>");
        resp.getWriter().print("<table>");
        resp.getWriter().print("<tr>");
        resp.getWriter().print("<td><a href=\"" + req.getContextPath() + "/main\">Main</a></td>");
        resp.getWriter().print("<td><a href=\"" + req.getContextPath() + "/catalog\">Catalog</a></td>");
        resp.getWriter().print("<td><a href=\"" + req.getContextPath() + "/product\">Product</a></td>");
        resp.getWriter().print("<td><a href=\"" + req.getContextPath() + "/cart\">Cart</a></td>");
        resp.getWriter().print("<td><a href=\"" + req.getContextPath() + "/order\">Order</a></td>");
        resp.getWriter().print("</tr>");
        resp.getWriter().print("</table>");


    }
}
