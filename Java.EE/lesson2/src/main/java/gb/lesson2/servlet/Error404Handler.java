package gb.lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "error404handler", urlPatterns = "/error404")

public class Error404Handler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<!DOCTYPE html>");
        resp.getWriter().print("<html>");
        resp.getWriter().print("<head>");
        resp.getWriter().print("<title>Ошибка!</title>");
        resp.getWriter().print("</head>");
        resp.getWriter().print("<body>");
        resp.getWriter().print("<h1>Ошибка 404. Страница не найдена!</h1>");
        resp.getWriter().print("</body>");
        resp.getWriter().print("</html>");
    }
}
