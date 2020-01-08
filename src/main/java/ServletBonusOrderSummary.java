import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderSummary", urlPatterns = "/order-summary")
public class ServletBonusOrderSummary extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String product = request.getParameter("product");
        String quantity = request.getParameter("quantity");
        PrintWriter writer = response.getWriter();
        writer.println("The product you've ordered is: " + product + ".");
        writer.println("The amount you've requested is: " + quantity + ".");
    }
}
