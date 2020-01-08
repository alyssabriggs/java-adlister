import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderFormServlet", urlPatterns = "/order-form")
public class ServletBonusOrderForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<form method='POST'' action='/order-summary'>");
        writer.println("<label for='product'>Product Name:</label>");
        writer.println("<input id='product' name='product' placeholder='Enter your product name' />");
        writer.println("<label for='quantity'>Quantity:</label>");
        writer.println("<input id ='quantity' name='quantity' placeholder='Enter quantity' />");
        writer.println("<button type='submit'>Submit</button>");
        writer.println("</form>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
