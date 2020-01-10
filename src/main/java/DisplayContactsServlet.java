import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/contacts")
public class DisplayContactsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        // Use the factory to get the dao object
        Contacts contactsDao = DaoFactory.getContactsDao();
        // Use a method on the dao to get all the products
        List<Contact> contact = contactsDao.getContacts();
        // Pass the data to the jsp
        request.setAttribute("contacts", contact);
        request.getRequestDispatcher("/contacts/index.jsp").forward(request, response);

        if (request.getMethod().equalsIgnoreCase("post")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("/profile");
            }
        }
    }
}