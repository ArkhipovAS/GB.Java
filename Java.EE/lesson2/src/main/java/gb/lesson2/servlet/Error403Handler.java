package gb.lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "error403handler", urlPatterns = "/error403")

public class Error403Handler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<!DOCTYPE html>");
        resp.getWriter().print("<html>");
        resp.getWriter().print("<head>");
        resp.getWriter().print("<title>Ошибка!</title>");
        resp.getWriter().print("</head>");
        resp.getWriter().print("<body>");
        resp.getWriter().print("<h2>Ошибка 403. Доступ запрещен!</h2>");
        resp.getWriter().print("</body>");
        resp.getWriter().print("</html>");
    }
}
