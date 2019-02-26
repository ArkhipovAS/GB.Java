package gb.lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().print("<h1>Product page servlet</h1>");
        resp.getWriter().print("<table>");
        resp.getWriter().print("<tr>");
        resp.getWriter().print("<td><a href=\"/lesson2/main\">Main</a></td>");
        resp.getWriter().print("<td><a href=\"/lesson2/catalog\">Catalog</a></td>");
        resp.getWriter().print("<td><a href=\"/lesson2/product\">Product</a></td>");
        resp.getWriter().print("<td><a href=\"/lesson2/cart\">Cart</a></td>");
        resp.getWriter().print("<td><a href=\"/lesson2/order\">Order</a></td>");
        resp.getWriter().print("</tr>");
        resp.getWriter().print("</table>");


    }
}