import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PrintName", urlPatterns = "/name")
public class ServletBonusName extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType(("text/html"));
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Alyssa Briggs</h1>");
    }

}
