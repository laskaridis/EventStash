package it.laskaridis.eventstash.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lefteris on 3/16/17.
 */

@WebServlet(
        name = "MyServlet",
        urlPatterns = { "/hello" }
)
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletOutputStream out = resp.getOutputStream();
        out.write("Hello!".getBytes());
        out.flush();
        out.close();
    }
}
