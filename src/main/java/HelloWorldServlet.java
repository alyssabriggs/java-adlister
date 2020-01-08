import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int iHitCounter;

    //init method just initializes the hitCounter to zero
    public void init() {
        iHitCounter = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello, World!</h1>");
        writer.println("<form><fieldset style='width:15%'>");
        writer.println("<h3>Welcome to my website!</h3><hr>");
        writer.println("You are visitor number: " + (++iHitCounter));
        writer.println("</fieldset></form>");
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        doGet(request, response);
    }

}

